package Service;

import Entity.Tache;

import java.util.ArrayList;
import java.util.List;

public class TacheServcice {


    public void ajouterUnTache(Tache tache) {
        List<Tache> tacheList = new ArrayList<Tache>();
        tacheList.add(tache);
    }

    public String TacheToJson(Tache tache) {
        StringBuilder json = new StringBuilder();
        json.append(String.format( "\"description\":\"%s\","
                        + "\"nom\":\"%s\","
                        + "\"prenom\":\"%s\",",
                tache.getDescription(), tache.getNom(), tache.getPrenom()

        ));
        json.append("\"maxTime\":\"").append(tache.getMaxTime()).append("\"");


        return json.toString();
    }

    public String afficheJsonTache(Tache tache) {
        TacheServcice service = new TacheServcice();
        System.out.println(service.TacheToJson(tache));
        return null;
    }

    

//not correctb not correct        //jkv
}
