package com.safetynetalerts.webapp.Data;

import com.safetynetalerts.webapp.model.*;
import com.safetynetalerts.webapp.model.specific.PersonAllInfo;
import com.safetynetalerts.webapp.model.specific.PersonFireStationResponse;
import com.safetynetalerts.webapp.model.specific.PersonFireZoneResponse;
import com.safetynetalerts.webapp.model.specific.PersonInfoByFloodZone;
import lombok.Data;

import java.util.List;
import java.util.Map;

@Data
public class JsonModel {
    private List<PersonAllInfo> fullInfo;

    private List<PersonFireStationResponse> personInfoByFireStation;

    private List<Person> personsByFireStation;

    private List<String> phoneAlert;

    private List <PersonFireZoneResponse> fireZones;

    private Map<String, List<PersonInfoByFloodZone>> floodZones;

    private List<Person> allPerson;

    private List<FireStation> allFireStation;

    private List<MedicalRecord> allMedicalRecord;
}
