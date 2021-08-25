package tester;

import java.util.Scanner;

import pojos.Emp;
import pojos.Mgr;
import pojos.Worker;

public class TestOrganization {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Organization Capacity...");
		Emp[] e = new Emp[sc.nextInt()];
		boolean exit = false;
		int counter = 0;
		
		while(!exit)
		{
			System.out.println("1.Hire Manager \n2.Hire Worker \n3.Display All Employees \n4.Update PerformanceBonus \n0.EXIT");
			switch(sc.nextInt())
			{
			case 1:
				System.out.println("Enter Manager details : [ID] [NAME] [DEPTID] [BASICSAL] [PERFORMANCE_BONUS]");
				e[counter++] = new Mgr(sc.nextInt(), sc.next(), sc.nextInt(), sc.nextDouble(), sc.nextDouble()  );
				System.out.println("Manager Added into Organization");
				break;
				
			case 2:
				System.out.println("Enter Worker details : [ID] [NAME] [DEPTID] [BASICSAL] [HOURS_WORKED] [HOURLY_RATE]");
				e[counter++] = new Worker(sc.nextInt(), sc.next(), sc.nextInt(), sc.nextDouble() ,sc.nextInt(), sc.nextInt()  );
				System.out.println("Worker Added into Organization");
				break;
				
			case 3:
				System.out.println("---Employees Details---\n");
				for(Emp e1 : e)
					if(e1 != null)
						System.out.println(e1);
				break;
				
			case 4:
				System.out.println("Enter Emp Id...");
				int tmpId = sc.nextInt();
				boolean flag = false;
				for(Emp e2 : e)
				{
					if(e2 != null && tmpId == e2.getId())
					{
						flag = true;
						if(e2 instanceof Mgr)
						{
							System.out.println("Enter Performance Bonus...");
							((Mgr) e2).setPerformanceBonus(sc.nextDouble());
						}
						else if(e2 instanceof Worker)
						{
							System.out.println("Enter Hourly Rate...");
							((Worker) e2).setHourlyRate(sc.nextInt());
						}
					}
				}
				if(flag == true)
					System.out.println("Data Updated");
				else
					System.out.println("ERROR!!! updation failed");
				break;
				
			case 0: 
				exit = true;
				System.out.println("EXITED");
				break;
			}
		}
		
		sc.close();
	}

}
