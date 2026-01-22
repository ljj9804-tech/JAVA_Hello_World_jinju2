package JAVA_260121.memberProject;

import java.io.*;
import java.util.*;

public class AA_MainClass {

    //저장할 파일 이름 미리 지정
    private static final String FILE_NAME = "members.txt";

    public static void main(String[] args) {

    Map<String, AA_MemberBase> members = new HashMap<>();
    loadMembers(members);


    Scanner sc = new Scanner(System.in);

    AA_MemberBase loggedInMember = null;

    while (true) {
        System.out.println();
    System.out.println("===== 회원 관리 시스템 =====");

        if (loggedInMember != null) {
            System.out.println("-------------------------------------------");
            System.out.println("로그인 한 유저 : " + loggedInMember.getEmail());
            System.out.println("-------------------------------------------");
            // 260121_기능추가_로그아웃, 순서1
            System.out.println("1. 회원가입 2. 로그아웃 3. 회원정보 조회 4. 회원정보 수정 5. 회원 검색 6. 종료");
        } else {

            System.out.println("1. 회원가입 2. 로그인 3. 회원정보 조회 4. 회원정보 수정 5. 회원 검색 6. 종료");
        }

        System.out.println("안녕하세요 메뉴를 선택해주세요.");
        System.out.print(">>");


        int choice; //메뉴 선택 변수

        try{
            choice = Integer.parseInt(sc.nextLine());
            if (choice < 1 || choice > 6){
                System.out.println("메뉴를 확인해주세요.");
                System.out.println("선택 가능 메뉴: 1~4");
                continue;
            }
        }   catch (NumberFormatException e) {
            System.out.println("숫자로 입력해주세요.");
            continue;
        }
        //=============================================================== 메뉴선택 페이지 완

        System.out.println();

        switch (choice) {

            case 1: /*회원가입*/
                System.out.println("===== 회원가입 ===== \n아래 내용을 입려해주세요.");
                    System.out.print("이름: ");
                    String name = sc.nextLine();
                    System.out.print("이메일: ");
                    String email = sc.nextLine();
                        if(members.containsKey(email)) {
                            System.out.println("이미 가입된 이메일입니다.");
                            break;
                        }
                    System.out.print("패스워드: ");
                    String password = sc.nextLine();
                    System.out.print("나이: ");
                    int age = Integer.parseInt(sc.nextLine());

                    AA_NormalMember newMember = new AA_NormalMember(name, email, password, age);
                    members.put(email, newMember);
                    newMember.join();

                    saveMembers(members);

                    break;

            case 2: /*로그인
                if(loggedInMember != null) { // 로그인 된 상태
                    loggedInMember = null; // 로그인 정보 초기화
                    System.out.println("로그아웃 되었습니다.");
                } else {
                    System.out.println("===== 로그인 =====");
                    System.out.println("이메일과 패스워드를 입력해주세요");
                    System.out.print("이메일: ");
                    String loginEmail = sc.nextLine();
                    System.out.print("패스워드: ");
                    String loginPw = sc.nextLine();

                    boolean isLogin = false;

                    if(members.containsKey(loginEmail)) {
                        AA_MemberBase member = members.get(loginEmail);

                        if(member.getEmail().equals(loginEmail) &&
                                member.getPassword().equals(loginPw)
                        ) {
                            System.out.println("로그인 성공!! 환영합니다.~" + member.name+ "님");
                            isLogin = true;
                            loggedInMember = member;
//                                break;
                        } // if 닫기
                        else { // 비밀번호가 틀린 경우
                            System.out.println("패스워드가 틀렸습니다.");

                        }
                    } // for 닫기. -> if 닫기 변경.
                    // 260121_기능추가_로그아웃, 순서3
                    else {
                        // 이메일이 존재하지 않는 경우
                        System.out.println("존재하지 않는 이메일입니다. ");
                    }
                }
                break;

            case 3: /*회원정보 조회*/
                System.out.println("===== 회원정보 조회 =====");

                if(members.isEmpty()){
                    System.out.println("\n가입된 회원이 없습니다");
                } else {
                    System.out.println("회원가입자 수: " + members.size() + "명");
                    System.out.println("--------------");
                }
                for (AA_MemberBase member: members.values()) {
                    member.showInfo();
                    System.out.println("--------------");
                }

                break;

            case 4: //회원정보 수정
                if(loggedInMember == null) {
                    System.out.println("로기인 후 수정 가능합니다.");
                    break;
                }
                System.out.println("===== 회원정보 수정 =====");
                System.out.println("수정할 항목을 선택하세요.");
                System.out.println("1. 패스워드 2. 이름 3. 나이 4. 취소");

                String choiceNumber = sc.nextLine();

                boolean isUpdated = false;

                switch (choiceNumber) {
                    case "1": //패스워드
                        System.out.print("새 패스워드 입력: ");
                        String newPw = sc.nextLine();
                        loggedInMember.setPassword(newPw);
                        isUpdated = true;

                        break;

                    case "2": //이름
                        System.out.print("수정할 이름: ");
                        String newName = sc.nextLine();
                        loggedInMember.setName(newName);
                        isUpdated = true;

                        break;

                    case "3": //나이
                        System.out.print("수정할 나이 입력: ");
                        int newAge = Integer.parseInt(sc.nextLine());
                        loggedInMember.setAge(newAge);
                        isUpdated = true;

                        break;

                    case "4": //취소
                        System.out.println("수정을 취소합니다.");
                        break;

                    default: System.out.println("잘못된 입력입니다.");
                }

            case 5: //회원 검색
                System.out.println("\n===회원 검색====");
                System.out.println("1. 이메일(ID)로 검색 정확히 일치");
                System.out.println("2. 이름으로 검색 (포함된 이름)");
                System.out.print("번호 선택 >>");

                String searchType = sc.nextLine();

                if(searchType.equals("1")) {
                    // 이메일로 검색
                    System.out.println("검색할 이메일 입력 : ");
                    String searchEmail = sc.nextLine();

                    if(members.containsKey(searchEmail)) {
                        System.out.println("\n 검색 결과");
                        System.out.println("--------------");
                        members.get(searchEmail).showInfo();
                        System.out.println("--------------");
                    } else {
                        System.out.println("해당 이메일의 회원이 업습니다.");
                    }

                } else if (searchType.equals("2")) {
                    // 이름으로 검색.
                    System.out.println("검색할 이름 입력:" );
                    String searchName= sc.nextLine();

                    boolean isFound = false;
                    System.out.println("\n검색중....\n");
                    System.out.println("--------------");

                    for(AA_MemberBase m: members.values()) {
                        if(m.getName().contains(searchName)) {
                            m.showInfo();
                            System.out.println("--------------");
                            isFound = true;
                        }
                    } // for 닫기
                    // 없을 경우.
                    if(!isFound) {
                        System.out.println("회원을 찾을수 없습니다. ");
                    }

                } else {
                    System.out.println("잘못된 입력입니다.");
                }
                break;



            case 6: /*종료*/
                System.out.println("프로그램을 종료합니다.");
                sc.close();
                return; //메인 메서드 종료

            default:
                System.out.println("메뉴를 확인해주세요.");
                System.out.println("선택 가능 메뉴: 1~4");

        } //switch
        //=============================================================== 메뉴 선택 스위치문
    } //while


} //main

    //입력 정보(members 리스트) 저장하기
    public static void saveMembers(Map<String, AA_MemberBase> members){
        BufferedWriter bw = null;

        try {
            bw = new BufferedWriter(new FileWriter(FILE_NAME));

            for(AA_MemberBase m : members.values()) {
              String line = m.getName()+","+m.getEmail()+","+m.getPassword()+","+m.getAge();
                bw.write(line); //파일에 한줄씩 기록
                bw.newLine(); //줄바꿈
            }
            System.out.println("파일 저장 완료 [" + FILE_NAME + "]");

        } catch (IOException e){
            System.out.println("오류가 발생 했습니다. 원인: " + e.getMessage());
        }finally {
            // 에러가 있든 ,없든 무조건 실행 되는 구간.
            // 자원 반납,  bw 기능 반납하기.
            if(bw != null) {
                try {
                    bw.close();
                } catch (IOException e) {
                    System.out.println("오류 발생, 파일 닫기 실패. ");
                }
            }

        }
    } // 신규 메소드(저장하는)

    private static int loadMembers(Map<String, AA_MemberBase> members) {
        File file = new File(FILE_NAME);
        if(!file.exists()) { // 해당 파일이 존재 안하니? true(파일없다)
            return 0;
        }

        int loadCount = 0;
        BufferedReader br = null;

        try {
            // new FileReader(file) : 물리 파일 읽는 도구
            // new BufferedReader : 빨리 읽어주는 도구.
            // br : 파일에서 읽었던 내용이 모두 br 에 들어가 있음(내용물)
            br = new BufferedReader(new FileReader(file));

            // 파일에서 읽어온 내용을 한줄씩 임의로 담아둘 변수.
            String line;
            // br.readLine(), : 전체 내용중에서, 한줄 읽기.
            while ((line = br.readLine()) != null ) {
                // 유효성 기본 체크, 읽을 때, 배열의 크기 이상을 읽지 못하게 막기.
                // 예시) loadCount : 4, members : 회원 가입된 인원 3명
                // 못 불러옴. 그래서 오류가 나니까, 미연에 방지하자.

                // 260121_업그레이드_배열에서ArrayList_변경, 순서6-3
                // 필요가 없다. 이제는 고정 크기가 아니여서,
//                if(loadCount >= members.length) {
//                    break;
//                }

                // 정상적으로 불러오는 경우
                // 쉼표를 기준으로 데이터를 불러오기.
                // 예시) line = "이상용,lsy@naver.com,1234,20"
                // split -> 문자열.split(","), 콤마를 기준으로 단어를 분리함.
                // String[] data = { "이상용", "lsy@naver.com",  "1234", "20"  }
                String[] data = line.split(",");
                if( data.length == 4) {
                    String name = data[0];
                    String email = data[1];
                    String password = data[2];
                    // Integer.parseInt : 문자열 -> 숫자로 변환
                    int age = Integer.parseInt(data[3]);

                    // 파일에서 읽어온 내용을 -> 메모리 상의 배열에 담기.
                    //name,email,password,age -> 객체에 담고 -> 배열에 담기.

                    // 260121_업그레이드_배열에서ArrayList_변경, 순서6-4
//                    members[loadCount] = new _3_NormalMember(name,email,password,age);
                    members.put(email, new AA_NormalMember(name,email,password,age));

                    // 파일에서 불러온 사람의 숫자를 확인하는 상태 변수 카운트 1증가.
                    loadCount++;

                }
            }
            System.out.println("파일 불러오기 완료 :" + loadCount + "명의 회원 정보를 불러옴.");
        }catch (IOException e){
            System.out.println("파일 불러오기 실패 원인 : " + e.getMessage());
        }finally {
            // 자원 반납. 읽어 오는 도구 자원반납, 스캐너 다 사용 후 반납하듯이
            if( br != null) {
                try {
                    br.close();
                } catch (IOException e) {
                    System.out.println("파일 닫기 실패");
                }
            }
        } // finally 닫기
        return loadCount;
    }



} //class
