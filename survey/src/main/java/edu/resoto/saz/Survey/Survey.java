package edu.resoto.saz.Survey;

import de.fhdo.lemma.msa.services.LemmaMicroservice;
import de.fhdo.lemma.msa.services.LemmaMicroserviceType;
import edu.resoto.saz.Survey.gen.SurveyGen;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@LemmaMicroservice(type = LemmaMicroserviceType.FUNCTIONAL)
@SpringBootApplication(scanBasePackages = "edu.resoto.saz.Survey")
public class Survey implements SurveyGen {

    public static void main(String[] args) {
        SpringApplication.run(Survey.class, args);
    }
}
