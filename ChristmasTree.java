import java.util.*; //for Random object
public class ChristmasTree {

public static void main(String[] args) {

Scanner scan = new Scanner(System.in);
System.out.println("How many ChristmasTrees would you like? ");
int repeat = scan.nextInt();

for (int z=0;z<repeat;z++) {

Random rand = new Random();
int count = 2;
int ornament = rand.nextInt(3)+1;
System.out.println("            *");
for (int i = 1; i <= 10; i++) {
if (count%2 == 1) {
for (int j = 10; j >= i+1; j--) {
System.out.print(" ");
}//end forj
System.out.print("/");
}else{
for (int j = 10; j >= i; j--) {
System.out.print(" ");
}//end forj
}//end if else
for (int j = i; j >= 1; j--) {
if (ornament == 3) {
System.out.print("*");
}else{
System.out.print("/");
}//end ifelse
ornament = rand.nextInt(3)+1;
}//end forj
System.out.print("/|\\");
for (int j = i; j >= 1; j--) {
if (ornament == 3) {
System.out.print("*");
}else{
System.out.print("\\");
}//end ifelse
ornament = rand.nextInt(3)+1;
}//end forj
if (count%2 == 1) {
System.out.print("\\");
}//end if
System.out.println();
count++;
}//end fori
System.out.println("          // \\\\");
System.out.println();
try {
Thread.sleep(1000);
}
catch (InterruptedException ex){}

}//end loop
System.out.println("                 ~Natalia Art\n             .*Happy Holidays*.");
}//end main
}//end public class