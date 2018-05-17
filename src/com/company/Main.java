package com.company;
import com.company.Figures.*;
import java.util.*;
import java.util.Scanner;
import com.company.Builders.*;
import com.company.Presentors.CirclePresenter;
import com.company.Presentors.RectanglePresenter;
import com.company.Presentors.SquarePresenter;
import com.company.Presentors.TrianglePresenter;


public class Main {
    enum shapesList { circle, square, rectangle, triangle }
    private static Scanner scanner = new Scanner(System.in);



    public static void main(String[] args) {
        System.out.println("choose a figure from available list of:" + Arrays.toString(shapesList.values()));
        shapesList shape;

        try {
             shape = shapesList.valueOf(scanner.nextLine().toLowerCase().trim());
        } catch (IllegalArgumentException e) {
            System.out.println("choose one of the figures from the list would you kindly");
            return;
        } catch (NullPointerException e) {
            System.out.println("input something baka");
            return;
        }

        switch (shape) {
            case circle:
                Circle circle = new CircleBuilder().buildFigure();
                CirclePresenter.present(circle);
                break;
            case square:
                Square square = new SquareBuilder().buildFigure();
                SquarePresenter.present(square);
                break;
            case rectangle:
                Rectangle rectangle = new RectangleBuilder().buildFigure();
                RectanglePresenter.present(rectangle);
                break;
            case triangle:
                Triangle triangle = new TriangleBuilder().buildFigure();
                TrianglePresenter.present(triangle);
                break;
        }
    }
}
