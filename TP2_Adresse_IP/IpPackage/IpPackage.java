package IpPackage;

public class IpPackage {

    public IpPackage (int A, int B, int C, int D){
    this.A = A;
    this.B = B;
    this.C = C;
    this.D = D;
    }

public void test() {
System.out.println(this.getOctet1() +"."+this.getOctet2()+"."+this.getOctet3()+"."+this.getOctet4());
}  
  
public int getOctet1(){
return this.A;
}

public int getOctet2(){
return this.B;
}

public int getOctet3(){
return this.C;
}
  
public int getOctet4(){
return this.D;
}   
     
private int A;
private int B;
private int C;
private int D;           
}
