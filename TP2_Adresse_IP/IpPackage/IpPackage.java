package IpPackage;

public class IpPackage {

    

    private IpPackage(int o1,int o2,int o3,int o4) {
        this.o1 = o1;
        this.o2 = o2;
        this.o3 = o3;
        this.o4 = o4;
    }

public void test() {
System.out.println("L'adresse IP est : "+this.getOctet1() +"."+this.getOctet2()+"."+this.getOctet3()+"."+this.getOctet4());
} 


public static IpPackage getInstance(int o1, int o2,int o3,int o4) {
    try 
    {
        if (o1 < 0 || o1 > 255 || o2 < 0 || o2 > 255 || o3 < 0 || o3 > 255 || o4 < 0 || o4 > 255)
        {
            throw new Exception();
        }
    }
    catch (Exception e)
    {
        System.out.println("Valeur impossible \n");
        // return null;
    }
    System.out.println("o1 = " + o1);        
    System.out.println("o2 = " + o2);        
    System.out.println("o3 = " + o3);
    System.out.println("o4 = " + o4);                

    return new IpPackage(o1,o2,o3,o4);
}

public int getOctet1(){
return this.o1;
}

public int getOctet2(){
return this.o2;
}

public int getOctet3(){
return this.o3;
}
  
public int getOctet4(){
return this.o4;
}   
     
private int o1;
private int o2;
private int o3;
private int o4;
       
public char getClasse(){
if (this.o1 <= 126)
    return 'A';
if (this.o1 >= 126 && this.o1 <= 191)
    return 'B'; 
if (this.o1 >= 192 && this.o1 <= 223)
    return 'C';
return 0; 
}       

public IpPackage adresseReseau(){
return null;
}    
       
}
