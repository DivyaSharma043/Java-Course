package ClassesAndObjectsProject;

public class usingStrings {
        public static void main(String[] args)
        {
            String s1 = "Divya";
            String s2 = "Sharma";
            System.out.println("Char at 3rd pos: " +s1.charAt(2));
            
            String s3;
            s3 = s1.concat(s2); // COmbine the String at the end of other string
            System.out.println(s3);
            System.out.println("Combine the Strings: "+ s1.concat(s2));
            System.out.println("Length of String s3: "+ s3.length());
            
            s3 = s3.replace("a","@");
            System.out.println("Replaced a with @: "+ s3);
            
            s3 = String.copyValueOf(s2.toCharArray());
            System.out.println(s3);
            
            int c;
            c = s2.compareTo(s3);
            
            if(c<0)
                System.out.println("s2 is less than s3");
            else if(c==0)
                System.out.println("s2 is equal to s3");
            else
                System.out.println("s2 is greater than s3");
            
            if (s1==s3)
                System.out.println("s1 is equal to s3");
            else
                System.out.println("s1 is not equal to s3");
            
            s3 =s1.toUpperCase();
            System.out.println(s3);
            
            s3 = s2.concat("Bhardwaz");
            System.out.println(s3);
            
            s3 = s1.replace(s1.charAt(4),'A');
            System.out.println(s3);
            
            int a,b;
            a = s2.indexOf("a");
            System.out.println("Index: "+ a);
            
            b=s2.lastIndexOf("a");
            System.out.println("Last Index: "+ b);
            
            String s;
            s =s2.substring(1, 3);
            System.out.println("Substring: "+ s);
            
            int i = 10;
            float f = 12.4f;
            String s4 = "Bhardwaz";
            s3 = String.format("Value of i = %d \nValue of f = %f  \nValue of s4 = %s",i,f,s4);
            System.out.println(s3);
            
            s3 = s1.concat(s2);
            System.out.println(s3);
            String[] s5 = s3.split("a",3);
            
            for(String s6 : s5)
               System.out.println("spliting: "+ s6);
           
            
            
        }
}
