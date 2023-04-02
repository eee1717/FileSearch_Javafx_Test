public class Main {

	public static void main(String[] args) {
	  
//		//파일 관리 폴더만들기
//		final String path ="C:\\말똥가리\\TEST"; //경로
//	   File folder = new File(path);
//	   folder.mkdir();
//	   System.out.println("파일폴더생성완료!");
//	   
//	   
//	   //파일생성하기
//	   final String filepath ="C:\\\\말똥가리\\\\TEST\\\\test.txt";
//	   
//	   File file = new File(filepath );
//	   
//	   try {
//		   file.createNewFile();
//		   System.out.println("파일생성 (경로"+ path +") ");
//	   }catch(IOException e)
//	   {
//		   System.out.println("파일생성에러");
//	   }
	   
//	   //파일 제거
//	  Path filepath = Paths.get("C:\\말똥가리\\TEST\\test.txt");
//	  Path directorypath = Paths.get("C:\\말똥가리\\TEST");
//	 
//	    try {
//	    	Files.delete(filepath);	    	
//	    	Files.delete(directorypath);
//	    	System.out.println("파일과폴더가삭제되었습니다.");
//	    }
//	    catch(NoSuchFileException e) {
//	    	System.out.println("삭제하려는파일/디렉토리가없습니다.");
//	    }catch(DirectoryNotEmptyException e){
//	    	System.out.println("디렉토리가 비어있지 않습니다.");
//	    }catch(IOException e){
//	    	e.printStackTrace();
//	    }
//	   
//    //외부웹사이트실행
//	   String addr = "http://www.naver.com"; 
//	   Process process = null;
//	   String[] cmd = new String[] {"rundll32", "url.dll", "FileProtocolHandler", addr};
//	   String str = null;
//	   
//	  try { 
//	   // 프로세스 빌더를 통하여 외부 프로그램 실행
//	    process = new ProcessBuilder(cmd).start();
//
//	    // 외부 프로그램의 표준출력 상태 버퍼에 저장
//	    BufferedReader stdOut = new BufferedReader( new InputStreamReader(process.getInputStream()) );
//	   
//	    // 표준출력 상태를 출력
//	    while( (str = stdOut.readLine()) != null ) {
//	        System.out.println(str);
//	    }
//	}catch(IOException e) {
//	    	e.printStackTrace();
//	    }
	   
//	
//	// 파일실행	 win32관련파일이아니면 오류걸린다.
//     Runtime rt = Runtime.getRuntime();
//   
//     System.out.println("파일실행");  
//     String exeFile = "D:\\StarCraft\\x86\\StarCraft.exe";
//     System.out.println(exeFile);
//     Process p;
//     try {
//    	    p = rt.exec(exeFile);
//    	    p.waitFor();
//    	} catch (Exception e) {
//    	    e.printStackTrace();
//    	}

		
	}

}
