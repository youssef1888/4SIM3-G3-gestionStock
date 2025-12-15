package tn.esprit.gestionstock;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class GestionStockApplication {

	private static final Logger log = LoggerFactory.getLogger(GestionStockApplication.class);

	public static void main(String[] args) {
		log.info("Démarrage de l'application GestionStock");
		SpringApplication.run(GestionStockApplication.class, args);
		log.debug("Application GestionStock démarrée avec succès");
	}
}
