package JAVA_260120;

import java.util.Scanner;

public class A_MainClass {

    private static final String FILE_NAME = "members.txt";

    public static void main(String[] args) {

        //회원가입자 배열 만들기[2]명 제한
        A_MemberBase[] members = new A_MemberBase[2];

        //현재 가입된 회원 수
        int count = 0;

        Scanner sc = new Scanner(System.in);

        while (true) {

            System.out.println("\n====회원 관리 시스템 ver 1.2=================");

            System.out.println("1. 로그인");
            System.out.println("2. 회원가입");
            System.out.println("3. 목록조회");
            System.out.println("4. 종료");
            System.out.println("메뉴 선택 >>");

            int choice;
            try {
                choice = Integer.parseInt(sc.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("숫자만 입력해주세요.");
                continue;
            }

            switch (choice) {

                //로그인
                case 1:
                    System.out.println("이메일과 패스워드를 입력해주세요");
                    System.out.print("이메일 : ");
                    String loginEmail = sc.nextLine();
                    System.out.print("패스워드 : ");
                    String loginPw = sc.nextLine();

                    boolean isLogin = false;

                    for (int i = 0; i < count; i++) {
                        A_MemberBase member = members[i];

                        if (member.email.equals(loginEmail) &&
                        member.password.equals(loginPw)) {
                            System.out.println("로그인 성공! [" + member.name + "]님 반갑습니다.");
                            isLogin = true;

                            break;
                        }

                    }
                    if (!isLogin) {
                        System.out.println("\n로그인 실패");
                        System.out.println("입력 정보를 확인해주세요.");
                    }
                    break;


                //회원가입
                case 2:
                    if (count < members.length) {

                        System.out.println("회원가입 페이지입니다");
                        System.out.println("아래 정보를 입력해주세요");

                        System.out.print("이름 : ");
                        String name = sc.nextLine();

                        System.out.print("이메일 : ");
                        String email = sc.nextLine();

                        System.out.print("패스워드 : ");
                        String password = sc.nextLine();

                        A_NormalMember newMember = new A_NormalMember(name, email, password);

                        members[count] = newMember;
                        newMember.join();
                        count++;
                    } else
                        System.out.println("회원가입 정원 초과, 가입 불가입니다.");

                    break;


                //목록조회
                case 3:
                    System.out.println("회원 현황");
                    System.out.println("회원가입자 수 : " + count);

                    int c = 1;
                    for (A_MemberBase i : members) {
                        if (i == null) break;
                        System.out.println("\n회원 " + c);
                        i.showInfo();
                        c++;
                    }
                    break;

                //종료
                case 4:
                    System.out.println("프로그램을 종료합니다. ");
                    // 스캐너 자원 반납
                    sc.close();
                    return; // 메인 메서드 종료

                default:
                    System.out.println("잘못된 입력입니다. 다시 선택해주세요.");

            } //switch

        } //while


    } //main



}
