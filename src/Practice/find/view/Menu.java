package Practice.find.view;

import Practice.find.model.Pet;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Menu {

    private final int n = 8;
    private final int [][] GPS = {
            {0,0,1,0,0,1,0,0},
            {0,0,0,0,1,1,0,0},
            {0,0,3,0,0,1,0,0},
            {0,0,0,0,0,3,0,0},
            {0,0,1,0,0,1,0,0},
            {0,0,1,1,0,0,0,0},
            {0,0,3,0,0,0,0,3},
            {0,0,0,1,0,1,0,0}};

    private final int path = 0;
    private final int hill = 1;
    private final int mt = 3;


    Pet [] pets = new Pet[3];

    public void info(){
        Scanner in = null;
        try {
            in = new Scanner(new File("data1.txt"));
            int i=0;
            while (in.hasNext()){
                pets[i] = new Pet();
                pets[i].setName(in.next());
                pets[i].setReward(in.nextInt());
                i++;
            }
        } catch (FileNotFoundException e) {
            System.out.println("파일이 없습니다.");
        }
        System.out.println(pets[0].getName()+pets[0].getReward());
    }





}
