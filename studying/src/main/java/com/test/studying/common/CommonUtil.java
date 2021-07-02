package com.test.studying.common;

import java.security.MessageDigest;
import java.util.Random;

import javax.crypto.SecretKey;
import javax.crypto.spec.SecretKeySpec;

import org.json.JSONObject;

public class CommonUtil {

	// 비밀번호 첫번째암호화
	public String getRandPW() {
		StringBuffer temp = new StringBuffer();
		Random rand = new Random();
		for(int i =0; i<6; i++) {
			int rindex = rand.nextInt(3);
			switch (rindex) {
			case 0:
				temp.append((char) ((int) (rand.nextInt(26))+97));
				break;
			case 1:
				temp.append((char)((int) (rand.nextInt(26))+65));
				break;
			case 2:
				temp.append((rand.nextInt(10)));
				break;
			}
		}
		return temp.toString();
	}
	//비밀번호 형식 맞추기 2번째 암호화
	public String setSHA256(String str) {
		String SHA ="";
		try {
			MessageDigest sh = MessageDigest.getInstance("SHA-256");
			sh.update(str.getBytes());
			
			byte byteDate[] = sh.digest();
			StringBuffer sb = new StringBuffer();
			for (int i = 0; i < byteDate.length; i++) {
				sb.append(Integer.toString((byteDate[i]&0xff)+0x100,16).substring(1));
			}
			SHA = sb.toString();
		} catch (Exception e) {
			e.printStackTrace();
			SHA=null;
		}
		return SHA;
	}
	
	//핸ㄷ폰 번호 복호화
	public String AES_Decode(String str) {
		//암호키 복호화에 필요 이걸로 바뀐다
		String secretKey= "0982beb15fb2f0c584fa5872527c58b9";
		byte[] keyData = secretKey.getBytes();
		SecretKey secretyKey = new SecretKeySpec(keyData, "AES");
		

		
		
	}





}
