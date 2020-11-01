package package8;

public class Main {

	public static void main(String[] args) {
		
		Doctor[] doctors = new Doctor[3];
        Engineer[] engineers = new Engineer[3];
        Pilot[] pilots = new Pilot[3];
        
        for (int i=0; i<3; i++){
            doctors[i] = new Doctor();
            engineers[i] = new Engineer();
            pilots[i] = new Pilot();
        }
        
        System.out.println("Enter Doctos data one by one :");
        for(int i=0;i<doctors.length;i++){
            System.out.println();
        	doctors[i].getData();
        	System.out.println("=========================================");
        }
        
        System.out.println("Enter Engineers data one by one :");
        for(int i=0;i<engineers.length;i++){
        	System.out.println();
            engineers[i].getData();
            System.out.println("=========================================");
        }
        
        System.out.println("Enter Pilots data one by one :");
        for(int i=0;i<pilots.length;i++){
        	System.out.println();
            pilots[i].getData();
            System.out.println("=========================================");
        }
        
        System.out.println("=========================================");
        for(int i=0;i<doctors.length;i++){
            System.out.println();
        	doctors[i].displayData();
        	doctors[i].appointments();
        }
        
        System.out.println("=========================================");
        for(int i=0;i<engineers.length;i++){
        	System.out.println();
            engineers[i].displayData();
            engineers[i].setNoOfProject();
            engineers[i].noOfProjectDone();
        }
        
        System.out.println("=========================================");
        for(int i=0;i<pilots.length;i++){
        	System.out.println();
            pilots[i].displayData();
            pilots[i].takeOff();
        }
        
	       
	}

}
