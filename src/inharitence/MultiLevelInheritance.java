package inharitence;

public class MultiLevelInheritance {

	public static void main(String[] args) {
	
		GrandFather gf=new GrandFather();
		gf.legacy();
		GrandFather.knowledge();
		System.out.println("________________________");
		Son2 s2= new Son2();
				Son2.advice();//son2 static method
				Son2.knowledge();////grandfather static method
				Son2.advice();//son2 father static method
               s2.business();//son2 father non static 
              s2.legacy();//grandfathr non static 
              System.out.println("-----------------------------");
              
              Son3.gold();
              Son3.advice();
              Son3.knowledge();
              Son3 s3=new Son3();
              s3.legacy();
              s3.money();
              Son3.advice();
              System.out.println("--------------------------------------");
              
	}

}
