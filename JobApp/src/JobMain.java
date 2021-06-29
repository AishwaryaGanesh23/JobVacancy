

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.AnnotationConfiguration;

public class JobMain {
	
public static void main(String args[]) throws IOException {
		
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));  
		System.out.print("Enter Candidate name: ");  
		String CandidateName=br.readLine();
		System.out.print("Enter Highest Qualififcation (masters/graduation/hssc): ");  
		String qualification=br.readLine();
		System.out.print("Has the Candidate ever represented the state of goa in Sports?(Yes/No): ");  
		String sport=br.readLine();
		 
		int points =0;
		if(qualification.equalsIgnoreCase("Masters"))
		{
			points = 5;
		}
		else if(qualification.equalsIgnoreCase("Graduation"))
		{
			points = 3;
		}
		else if(qualification.equalsIgnoreCase("Hssc"))
		{
			points = 1;
		}
		
		if(sport.equalsIgnoreCase("Yes"))
		{
			points = points+3;
		}
		
		Candidate c = new Candidate();
		c.setCandidate_name(CandidateName);		
		c.setCandidate_points(points);
		
		SessionFactory sessionfactory=new AnnotationConfiguration().configure().buildSessionFactory();
		Session session=sessionfactory.openSession();
		session.beginTransaction();
		session.save(c);
		session.getTransaction().commit();
		session.close();
		sessionfactory.close();
	}
}
