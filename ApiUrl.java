//program 4
//to call rest APi

import java.io.*;
import java.net.*;

class ApiUrl
	{
		public static void main(String[] args)throws Exception
		{
			URL U1 =new URL("https://my-json-server.typicode.com/typicode/demo/posts");
			URLConnection U2 = U1.openConnection();
			InputStream is = U2.getInputStream();
			boolean i;
			while (i=is.read()!=-1)
			{
				System.out.println(i);
			}
		}
	
	} 