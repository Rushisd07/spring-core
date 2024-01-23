package com.core.resource;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

import org.springframework.core.io.Resource;

//Resource is an interface of spring core

public class ResourceInjection {
	private Resource file;

	public ResourceInjection() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Resource getFile() {
		return file;
	}

	public void setFile(Resource file) {
		this.file = file;
	}
	
	public void process() {
		String path="e:\\test\\";
		try {
			InputStream is = file.getInputStream();		//get the contents of the file
			OutputStream os = new FileOutputStream(path + file.getFilename());	//file would be copied to the dest folder
			
			//following would read and write the content of the file from the config file
			int c;
			while((c = is.read())!= -1)	//-1 represents end of file
				os.write(c);			//char by char is read and written to the file
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
}
