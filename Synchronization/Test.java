class Deploy
{
synchronized void app(int dur)
{
for(int i=1;i<=5;i++)
{
System.out.println(i*dur);
try
{
Thread.sleep(2000);
}
catch(Exception e) {
e.printStackTrace();
}
}
}
}
class Client1 extends Thread
{
Deploy d;
public Client1(Deploy d) {
this.d=d;
}
@Override
public void run() {
d.app(5);
}
}
class Client2 extends Thread
{
Deploy d;
public Client2(Deploy d) {
this.d=d;
}
@Override
public void run() {
d.app(10);
}
}
public class Test {
public static void main(String[] args) {
Deploy d = new Deploy();
Client1 c1 = new Client1(d);
Client2 c2 = new Client2(d);
c1.start();
c2.start();
}
}
