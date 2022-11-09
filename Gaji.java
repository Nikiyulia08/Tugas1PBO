public class Gaji extends Pegawai {                                 //Polymorphism karena menghubungkan banyak class satu dan lainnya memalui inheritance
    private double salary; 
    private double newSalary;
    public Gaji (String name, String address, int number, double 
    salary ){
    super (name, address, number);
    setSalary(salary);
    }
    public void mailCheck(){                                        //Polymorphism Upcasting karena sebelumnya ini merupakan upcasting dari kelas pegawai.
    System.out.println ("Memeriksa kelas gaji dalam surat" );
    System.out.println ("Surat tertuju untuk" + getName()
    + "dengan gaji" + salary);
    }
    public double getSalary(){
    return salary;
    }
    public void setSalary (double salary2){
    if(newSalary>= 0.0){
    salary = newSalary;
    }
    }
    public double computePay (){
    System.out.println ("Menghitung pembayaran gaji untuk " + getName());
    return salary/52;
    }
}
