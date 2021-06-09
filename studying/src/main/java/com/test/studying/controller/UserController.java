package com.test.studying.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.RequestEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.json.JSONObject;

import com.test.studying.common.ResponseResult;
import com.test.studying.dao.UserDao;
import com.test.studying.dto.UserDto;

@RestController
@MapperScan(basePackages="com.test.studying.dao")//탐색할 패키시 설정
public class UserController {
	@Autowired
	private UserDao userDAO;//UserDAO bean을 자동으로 주입
	
	@RequestMapping("/test")
	public String test() throws Exception { //query String으로 county를 받도록 설정
		return "안녕";
	}
	
	@RequestMapping("/users")
	public List<UserDto> users() throws Exception { //query String으로 county를 받도록 설정
//		final UserDto param = new UserDto();
		final List<UserDto> userList = userDAO.selectUser();// 22번 째 줄에서 생성한 객체를 파라미터로 전달하여 DB로부터 사용자 목록을 불러온다.
		return userList;
	}
	
	@RequestMapping("/useradd")
	public ResponseEntity<ResponseResult> useradd(@RequestBody String requestString) throws Exception{

		ResponseResult response = new ResponseResult();
		
		JSONObject jsonMember = new JSONObject(requestString);
		response.setState(200);
        response.setMessage("정상 처리 완료");

        JSONObject request = jsonMember.getJSONObject("request");

        String id = request.getString("id");
        String name = request.getString("name");
        String birth = request.getString("birth");
        String hp = request.getString("hp");
        String pw = request.getString("pw");
        
        UserDto user = new UserDto();
        user.setBirth(birth);
        user.setHp(hp);
        user.setId(id);
        user.setName(name);
        user.setPw(pw);
         
        int cnt = userDAO.insertUser(user);
        
        System.out.println(cnt);
	//	Map<String, Object> result = new HashMap<>();
		//result.put("UserInfo", user);
        System.out.println(cnt);
        
        response.setResult(user);
	    return new ResponseEntity<ResponseResult>(response, HttpStatus.OK);
		
	}
	
	@RequestMapping("/userlogin")
	public ResponseEntity<ResponseResult> userlongin(@RequestBody String requestString) throws Exception{
		ResponseResult response= new ResponseResult();
		response.setState(200);
		response.setMessage("정상 처리 완료");
		JSONObject jsonmember = new JSONObject(requestString);
		JSONObject request = jsonmember.getJSONObject("request");
		String id = request.getString("id");
		String pw = request.getString("pw");
		UserDto user = new UserDto();
		user = userDAO.selectLogin(id, pw);
		if (user==null) {
			response.setState(207);
			response.setMessage("존재하지 않는 회원입니다.");
			return new ResponseEntity<ResponseResult>(response, HttpStatus.OK);
		}
		response.setResult(user);
		return new ResponseEntity<ResponseResult>(response, HttpStatus.OK);
	}
	
	
}