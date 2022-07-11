package com.example.demo.user.service;

import com.example.demo.user.domain.User;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class UserService {

    private List<User> users = new ArrayList<>();

    // 의존성 주입이 이루어진 후 초기화를 수행하는 메서드
    @PostConstruct
    public void init() throws Exception  {
        BufferedReader br = null;
        try {
            File file = new File("C:\\Users\\hyeok\\OneDrive\\바탕 화면\\user\\user.txt");
            FileInputStream inputStream = new FileInputStream(file);
            br = new BufferedReader(new InputStreamReader(inputStream, "UTF-8"));

            String line = "";
            String num = null;
            int count = 0;


            while ((line = br.readLine()) != null) {
                count++;

                //System.out.println(line);
                String[] result = line.replaceAll("[_ ]", "").split(",");

                if (result.length == 5 && result[4].matches("-?\\d+")) {
                    User user = new User();

                    user.setUserId(Integer.parseInt(result[0]));
                    user.setUserName(result[1]);
                    user.setUserAge(Integer.parseInt(result[2]));
                    user.setUserGender(result[3]);
                    user.setUserSalary(Integer.parseInt(result[4]));

                    users.add(user);
                } else {
                    System.out.println("에러 라인 : " + line);
                }
            }
            System.out.println("Total Users : " + users.size());
        } catch (Exception ex) {
            ex.printStackTrace();
        } finally {
            br.close();
        }
    }

    // 1. 전체 user 가 json 형태로 return 되도록 구현
    public List<User> getUserList(){

        List<User> searchUser = users.stream()
                .filter(User -> User.getDeleteStatus() == 'N')
                .collect(Collectors.toList());

        return searchUser;

    }

    // 2. ID 를 넣어서 user 찾고 찾은 데이터를 json 형태로 return 되도록 구현
    public User getUser(int userId){

//        for(User user : users){
//            if (userId == user.getUserId()){
//                System.out.println(user);
//                return user;
//
//            }
//        }

        Optional<User> first = users.stream()
                .filter(User -> User.getUserId() == userId)
                .findFirst();

        User user = first.orElse(new User());

        return user;
    }

    // 3. 특정 ID의 삭제 여부를 바꾼다 N -> Y 삭제여부
    public Boolean deleteUser (int userId){

        Optional<User> first = users.stream()
                .filter(User -> User.getUserId() == userId)
                .findFirst();

        User user = first.orElse(new User());

        user.setDeleteStatus('Y');

        return true;

    }

    // 3.1 버전 PATCH
    public Boolean deleteUserV2(int userId) {

        Optional<User> first = users.stream()
                .filter(User -> User.getUserId() == userId)
                .findFirst();

        User user = first.orElse(new User());

        user.setDeleteStatus('Y');

        return true;
    }

    // 3.1 삭제된 유저 리스트 출력
    public List<User> deleteUserList(){
        List<User> deleteUser = users.stream()
                .filter(user -> user.getDeleteStatus() == 'Y')
                .collect(Collectors.toList());

        return deleteUser;

    }


    // 4. 이름을 포함문자열 검색을 사용하여 찾고 json 형태로 return 되도록 구현
    public List<User> getUserName(String userName){

        List<User> searchUser = users.stream()
                .filter(User -> User.getUserName().contains(userName))
                .collect(Collectors.toList());

        if(searchUser.size() == 0){
            // 여기다가 exception 발생
            System.out.println("목록에 없습니다");
        }

        return searchUser;

    }



//  // 5. 새로운 유저 생성
//  public boolean insertUser(){
//
//
//
//
//        return true;
//  }


  // 6. 유저 업데이트



}


