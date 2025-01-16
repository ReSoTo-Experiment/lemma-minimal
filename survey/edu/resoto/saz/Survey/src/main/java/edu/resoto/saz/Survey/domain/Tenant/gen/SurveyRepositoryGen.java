package edu.resoto.saz.Survey.domain.Tenant.gen;

import edu.resoto.saz.Survey.domain.Tenant.Survey;
import java.util.List;

public interface SurveyRepositoryGen {

    List<Survey> getSurveysCollection();

    void setSurveysCollection(List<Survey> surveysCollection);

    Survey findByGuid(String guid);
}
