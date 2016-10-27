package it.tai;

import it.tai.domain.Fattura;
import it.tai.repository.FatturaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

@SpringBootApplication
@RestController
class ResourceApplication implements CommandLineRunner {

    @Autowired
    private FatturaRepository repository;

	@RequestMapping("/")
	@CrossOrigin(origins="*", maxAge=3600)
	public Message home() {
		return new Message("Hello World");
	}

	public static void main(String[] args) {
		SpringApplication.run(ResourceApplication.class, args);
	}

    @Override
    public void run(String... args) throws Exception {
        repository.deleteAll();

        //Save a couple of fatturas
        repository.save(new Fattura("Michele", "Romani", "Tai Reietti srl", "RMNMHL93R28A470U","00123456789", "via Monviso 16",
                "Mantova", "MN", "333117685", "46041", "28/10/1993", "mromani",
                "password", "mromani@tai.it"));
        repository.save(new Fattura("Marco", "Strambelli", "Tai Reietti srl", "MRCSTR93S12A470U","00987654321", "via Schmitd 7",
                "Trento", "TN", "3333455422", "38122", "12/12/1993", "mstrambelli",
                "password", "mstrambelli@tai.it"));

        // fetch all fatturas
        System.out.println("Fatture trovate con findALL():");
        System.out.println("------------------------------");
        for(Fattura fattura : repository.findAll()){
            System.out.println(fattura);
        }
        System.out.println();

        // fetch an individual customer
        System.out.println("Fatture trovate con findByUsername('mromani'):");
        System.out.println("----------------------------------------------");
        System.out.println(repository.findByUsername("mromani"));

        System.out.println("Fatture trovate con findByComoany('Tai Reietti srl'):");
        System.out.println("-------------------------------------------------");
        for(Fattura fattura : repository.findByCompany("Tai Reietti srl")){
            System.out.println(fattura);
        }


    }
}
class Message {
	private String id = UUID.randomUUID().toString();
	private String content;

	Message() {
	}

	public Message(String content) {
		this.content = content;
	}

	public String getId() {
		return id;
	}

	public String getContent() {
		return content;
	}
}
