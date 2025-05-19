package _11_NestedLoop;

public class NestedLoop {
    public static void main(String[] args) {
        //이중 반복문

        //네모 별 찍기
        //*****
        //*****
        //*****
        //*****
        //*****

        for (int i = 0; i < 5; i++) { //세로줄
            for (int j = 0; j < 5; j++) { //가로줄
                System.out.print("*");
            }
            System.out.println(); //줄바꿈
        }
        System.out.println();

        //별 삼각형 찍기
        //*
        //**
        //***
        //****
        //*****

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < i + 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println();

        //*****
        //****
        //***
        //**
        //*
        for (int i = 0; i < 5; i--) {
            for (int j = 0; j < i -1; j--) {
                System.out.print();

            }
        }


    }
}
