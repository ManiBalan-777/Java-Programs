import java.io.*;
class files
{
	void file() throws Exception
	{
		File f=new File("C://Users//WELCOME//Desktop//files//mani.txt");
		FileWriter fw=new FileWriter(f);
		fw.write("My Name Is ManiBalan I am Studying BE CSE IN 1234!@#$Government Engineering College");
		fw.close();
	}
}
class operation
{int ch;
	void opera() throws Exception
	{
		
		File f=new File("C://Users//WELCOME//Desktop//files//mani.txt");
		if(! f.exists())
			System.out.println("File not found");
		else
		{
			
			System.out.println("File found");
			do{
			DataInputStream d=new DataInputStream(System.in);
			System.out.println("Enter which operation you want?");
			String operation =d.readLine();
			FileInputStream fr=new FileInputStream(f);
			switch(operation)
			{
				case "alphabets":
				{int c=0,co=0;
					while(fr.available()>0)
					{
						c=fr.read();
						if((97<=c)&&(c<=122)|| (65<=c)&&(c<=90));
							co++;
					}
					System.out.println("the number of alphabets in the file are:"+co);
				break;
				}
				case "vowels":
				{int c=0,p=0;
				while(fr.available()>0)
				{
				
					c=fr.read();
					if(c=='a' || c=='e' || c=='i' || c=='o'|| c=='u'||c=='A' || c=='E' || c=='I' || c=='O'|| c=='U')
					{
					
						p++;
					
					}
				}
				System.out.println("the number of vowels  in the file are:"+p);
				break;
				}
				case "words":
				{int c=0,q=0;
					while(fr.available()>0)
					{
						
						c=fr.read();
						if(c==' '||c==','||c=='\n')
						{
						
							q++;
					
						}	
					}
					System.out.println("the number of words  in the file are:"+q);
				break;
				}
				case "lines":
				{int c=0,r=0;
					while(fr.available()>0)
					{
				
						c=fr.read();
						if(c=='\n')
						{
					
							r++;
					
						}
					}
					System.out.println("the number of lines  in the file are:"+r);
				break;
				}
				case "digits":
				{int c=0,s=0;
					while(fr.available()>0)
					{
						
						c=fr.read();
						if(c>=48&&c<=57)
						{
					
							s++;
					
						}
					}
					System.out.println("the number of digits  in the file are:"+s);
				break;
				}
				case "special symbols":
				{int c=0,t=0;
					while(fr.available()>0)
					{
						
						c=fr.read();
						if(c>=33&&c<=47||c>=58&&c<64||c>=91&&c<=96||c>=123&&c<=126)
						{
					
							t++;
					
						}
					}
					System.out.println("the number of special symbols  in the file are:"+t);
				break;
				}
			}
			System.out.println("If you want to continue press 1:");
			ch=Integer.parseInt(d.readLine());
			}while(ch==1);
		}
	}	
			
}
class mani
{
	public static  void main(String args[]) throws Exception
	{
		files ok=new files();
		
		ok.file();
		operation h=new operation();
		h.opera();
	}
}