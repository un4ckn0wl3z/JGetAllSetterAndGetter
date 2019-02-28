import java.lang.reflect.Method;


public class Main {

	public static void main(String[] args) {


        try {
            Class c = Class.forName("com.target.TargetModel");
            Method m[] = c.getMethods();
            for (int i = 0; i < m.length; i++)
             if (m[i].getName().startsWith("set")){
                 System.out.println("instanceName."+m[i].getName()+"(\"valOne\");");
             }
            System.out.println("===========================================================");
            for (int i = 0; i < m.length; i++)
                if (m[i].getName().startsWith("get")){
                    System.out.println("instanceName."+m[i].getName()+"(\"valOne\");");
                }

         }
         catch (Throwable e) {
            System.err.println(e);
         }

	}

}
