package java_20190808.unicast.server;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.Socket;

public class UnicastServerThread implements Runnable {
	private Socket socket;

	public UnicastServerThread(Socket socket) {
		// TODO Auto-generated constructor stub
		this.socket = socket;
	}

	@Override
	public void run() {
		BufferedReader br = null;
		BufferedWriter bw = null;
		// TODO Auto-generated method stub
		try {
			br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
			bw = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream())); // 한 줄로

			boolean isStop = false;
			while (!isStop) {
				//정상메시지 => id : message
				//종료메시지 => shutdown
				String readLine = br.readLine();
				System.out.println(readLine);
				if (readLine.equals("shutdown")) {
					bw.write("shutdown\n");
					bw.flush();
					isStop = true;
				} else {
					bw.write(readLine + "\n");
					bw.flush();
				}
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			System.out.println("비정상적으로 종료되었습니다.");
			
		}
	}

}
