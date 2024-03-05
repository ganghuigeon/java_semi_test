package java_02;

public class quiz03 {
    public class Marine {
        int x = 0, y = 0; // Marine의 위치좌표(x,y)
        int hp = 60; // 현재 체력
        int weapon = 6; // 공격력
        int armor = 0; // 방어력

       void weaponUp() {
            weapon++;
        }

        void armorUp() {
            armor++;
        }

        void move(int x, int y) {
            this.x = x; // this.x는 인스턴스 변수, x는 지역변수
            this.y = y; // this.y는 인스턴스 변수, y는 지역변
        }


        //메소드쪽의 weaponUp, armorUp 에 static을 사용할 경우, 에러 발생하므로
        //Marine 클래스 상단에 있는 weapon, armor에 static을 써주어야 함
        //Marine 들의 공격력 방어력 업그레이드 시 같아질 것임
    }
}
