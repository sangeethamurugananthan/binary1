import java.util.*;
class binary1
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int a=sc.nextInt();
ArrayList <String>ts=new ArrayList<String>();
ArrayList <Integer>ty=new ArrayList<Integer>();

for(int i=0;i<a;i++)
{

String s=Integer.toString(sc.nextInt(),2);
char c[]=s.toCharArray();
int count=0;
for(int j=0;j<c.length;j++)
{
if(String.valueOf(c[j]).equals("1"))
count++;
}
ts.add(String.valueOf(count)+","+s);
}
Collections.sort(ts);

for(int i=ts.size()-1;i>=0;i--)
{
ty.add(Integer.parseInt(ts.get(i).substring(2),2));

}
System.out.println(ty);
}
}

