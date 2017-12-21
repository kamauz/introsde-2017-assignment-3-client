package introsde.assignment3.soap.client;

import java.io.PrintWriter;
import java.net.URL;
import java.util.List;

import javax.xml.namespace.QName;
import javax.xml.ws.Service;

import introsde.assignment3.soap.*;
import introsde.assignment3.soap.Person.Activities;

public class PeopleClient{
    
    public static String pString="";
    public static void populateDb(Service service) {
        People people = service.getPort(People.class);
        
        Person p = new Person();
        p.setName("Marco");
        p.setLastname("Michelotti");
        p.setBirthdate("19/05/1993");
        p.setActivities(new Activities());
        
        Activities pref = p.getActivities();
        Preference pr = new Preference();
        pr.setName("Guitar");
        pr.setDescription("playing guitar");
        pr.setPlace("Rovereto");
        pr.setStartdate("04/05/2005");
        pr.setType("Music");
        //pr.setRate(2);
        pref.getActivity().add(pr);
        
        Preference pr2 = new Preference();
        pr2.setName("Coding");
        pr2.setDescription("writing code at the computer");
        pr2.setPlace("Home");
        pr2.setStartdate("04/10/2010");
        pr2.setType("School");
        //pr2.setRate(2);
        pref.getActivity().add(pr2);
        
        
        people.createPerson(p);
    }
    
    public static void printPreference(Preference p, String tab) {
        if (p == null) {
            return;
        }
        /*print(tab+"\t=> Activity:\n\n\t\t"+tab+"Id: "+p.getId()+"\n\t\t"+tab+"Name: "+p.getName()+"\n\t\t"+tab+"Description: "+p.getDescription()+"\n\t\t"+tab+"Place: "+p.getPlace()+"\n\t\t"+tab+"Startdate: "+p.getStartdate()+
                "\n\t\t"+tab+"Type: "+p.getType()+"\n\t\t"+tab+"Rate: "+p.getRate()+"\n");*/
        print(tab+"\t=> Activity:\n\n\t\t"+tab+"Id: "+p.getId()+"\n\t\t"+tab+"Name: "+p.getName()+"\n\t\t"+tab+"Description: "+p.getDescription()+"\n\t\t"+tab+"Place: "+p.getPlace()+"\n\t\t"+tab+"Startdate: "+p.getStartdate()+
                "\n\t\t"+tab+"Type: "+p.getType()+"\n\t\t"+tab+"\n");
    }
    
    public static void printPerson(Person element) {
        print("\t=> Person\n\n\t\tId: "+element.getIdPerson()+"\n\t\tName: "+element.getName()+"\n\t\tLastname: "+element.getLastname() +
                "\n\t\tBirthdate: "+element.getBirthdate()+"\n");
        
        for (Preference p : element.getActivities().getActivity()) {
            printPreference(p,"\t");
        }
    }
    
    public static void print(String s) {
        System.out.println(s);
        pString+=s+"\n";
    }
    
    public static void main(String[] args) throws Exception {
        //URL url = new URL("http://localhost:6902/people?wsdl");
        //URL url = new URL("http://192.168.1.101:8080/es3/people?wsdl");
        URL url = new URL("http://sde3-4.herokuapp.com/people?wsdl");
        
        //1st argument service URI, refer to wsdl document above
        //2nd argument is service name, refer to wsdl document above
        QName qname = new QName("http://soap.assignment3.introsde/", "PeopleService");
        Service service = Service.create(url, qname);
        
        People people = service.getPort(People.class);
        if(people.readPersonList().size()<4) {
            populateDb(service);
        }
        
        PrintWriter log = new PrintWriter("assignment3.log", "UTF-8");
        //populateDb(service);
        
        // 1 
        print("## EXERCISE 1) readPerson\n");
        List<Person> pList = people.readPersonList();
        for (Person element : pList) {
            printPerson(element);
            print("\n");
        }
        if (pList == null) {
            print("===> error");
        } else {
            print("===> people read successfully");
        }
        
        print("\n=====================================================================\n");
        
        // 2
        print("## EXERCISE 2) readPerson(Long id)");
        Person p = people.readPerson(pList.get(0).getIdPerson());
        if (p == null) {
            print("===> error");
        } else {
            printPerson(p);
            print("===> person read successfully");
        }
        
        print("\n=====================================================================\n");
        
        // 3
        print("## EXERCISE 3) updatePerson(Person p)");
        String prev = p.getName();
        p.setName("Antonia (modified)");
        Person p2 = people.updatePerson(p);
        if (p2.getName().equals("Antonia (modified)")) {
            printPerson(p2);
            print("===> modified successfully");
            p.setName(prev);
            p = people.updatePerson(p);
        } else {
            print("===> error ");
        }
        
        print("\n=====================================================================\n");
        
        // 4
        print("## EXERCISE 4) createPerson(Person p)");
        p2 = new Person();
        p2.setName("Lucia");
        p2.setLastname("Mestoli");
        p2.setBirthdate("01/01/1990");
        p2.setActivities(new Activities());
        
        Activities pref = p2.getActivities();
        Preference pr = new Preference();
        pr.setName("Dance");
        pr.setDescription("dancing in the theatre");
        pr.setPlace("Theatre");
        pr.setStartdate("14/02/2001");
        pr.setType("Type1");
        //pr.setRate(2);
        pref.getActivity().add(pr);
        
        Preference pr2 = new Preference();
        pr2.setName("Sing");
        pr2.setDescription("singing everywhere");
        pr2.setPlace("Trento");
        pr2.setStartdate("08/11/2015");
        pr2.setType("Music");
        //pr2.setRate(2);
        pref.getActivity().add(pr2);
        
        Person p3 = people.createPerson(p2);
        if (p3!=null) {
            printPerson(p3);
            print("===> created successfully");
        } else {
            print("===> error");
        }
        
        print("\n=====================================================================\n");
        
        // 5
        print("## EXERCISE 5) deletePerson(Long id)");
        long id = pList.get(0).getIdPerson();
        people.deletePerson(id);
        Person p4 = people.readPerson(id);
        if (p4 == null) {
            print("null");
            print("===> deleted successfully");
        } else {
            print("===> error");
        }
        
        print("\n=====================================================================\n");
        
        // 6
        print("## EXERCISE 6) readPersonPreferences(Long id, String activity_type)");
        pList = people.readPersonList();
        id = pList.get(0).getIdPerson();
        if (pList.get(0).getActivities().getActivity().get(0).getType() != null) {
            String type = pList.get(0).getActivities().getActivity().get(0).getType();
            List<Preference> p5 = people.readPersonPreferences1(id, type);
            for (Preference element : p5) {
                printPreference(element,"");
            }
            print("===> works");
        } else {
            print("===> error");
        }
        
        print("\n=====================================================================\n");
        
        // 7
        print("## EXERCISE 7) readPreferences()");
        List<Preference> listP = people.readPreferences();
        if (listP == null) {
            print("===> error");
        } else {
            for (Preference pl : listP) {
                printPreference(pl,"");
            }
            print("===> works");
        }
        
        print("\n=====================================================================\n");
        
        // 8
        print("## EXERCISE 8) readPersonPreferences(Long id, Long activity_id)");
        id = pList.get(0).getIdPerson();
        Long activity_id = (long)pList.get(0).getActivities().getActivity().get(0).getId();
        Preference pref2 = people.readPersonPreferences2(id, activity_id);
        if (pref2!=null) {
            printPreference(pref2,"");
            print("===> works");
        } else {
            print("===> error");
        }
        
        print("\n=====================================================================\n");
        
        // 9
        print("## EXERCISE 9) savePersonPreferences(Long id, Activity activity)");
        id = pList.get(0).getIdPerson();
        Preference pTmp = new Preference();
        
        pTmp.setName("New Preference");
        pTmp.setDescription("description of a new preference");
        pTmp.setPlace("Trento");
        pTmp.setStartdate("10/10/2011");
        pTmp.setType("Type");
        
        people.savePersonPreferences(id, pTmp);
        List<Preference> p8test = people.readPersonPreferences1(id,pTmp.getType());
        boolean ok=false;
        print("\tLength: "+p8test.size());
        for (Preference pTest : p8test) {
            printPreference(pTest,"");
            if (pTest.getName().equals(pTmp.getName()) && pTest.getStartdate().equals(pTmp.getStartdate()) && 
                    pTest.getPlace().equals(pTmp.getPlace())) {
                print("===> preference created successfully");
                ok=true;
                break;
            }
        }
        if(ok == false) {
            print("===> error");
        }
        
        print("\n=====================================================================\n");
        
        // 10
        print("## EXERCISE 10) updatePersonPreferences(Long id, Activity activity)");
        pList = people.readPersonList();
        Preference p10 = pList.get(0).getActivities().getActivity().get(0);
        p10.setName("updated name");
        people.updatePersonPreferences(pList.get(0).getIdPerson(), p10);
        Preference pp = people.readPersonPreferences2(pList.get(0).getIdPerson(),p10.getId());
        if (pp != null && pp.getName().equals("updated name")) {
            printPreference(pp,"");
            print("===> updated successfully");
        } else {
            print("===> error");
        }
        
        print("\n\n");
        
        /*
        // 11 (extra)
        print("## EXERCISE 11) evaluatePersonPreferences(Long id, Preference activity, int value)");
        printPreference(p10,"");
        Preference p11 = people.evaluatePersonPreferences(pList.get(0).getIdPerson(), p10, 6);
        printPreference(p11,"");
        if (p11 != null && p11.getRate() != null && p11.getRate().intValue() == 6) {
            print("===> evaluated successfully");
        } else {
            print("===> error");
        }
        
        print("\n\n");*/
        
        log.println(pString);
        log.close();
        
        
    }
}
