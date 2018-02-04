package com.rajeshpatkar;

public class LearningCloneable {

    public static void main(String[] args) throws Exception {
        
        Point pt1 = new Point(5, 5);
        Point pt2 = new Point(10, 5);
        Segment seg1 = new Segment(pt1, pt2);
        Segment clonedSeg1 = seg1.clone();
        System.out.println(
                "printing the original and cloned segment "
                + "objects before modifying\n\n");
        System.out.println("ORG : " + seg1);
        System.out.println("CLONED : " + clonedSeg1);
        System.out.println("\n\nmodifying the cloned Segment... \n\n");
        clonedSeg1.setP1(44, 55);
        clonedSeg1.setP2(66, 77);
        System.out.println("printing the original and cloned segment "
                           + "objects after modification \n\n");
        System.out.println("ORG : " + seg1);
        System.out.println("CLONED : " + clonedSeg1);

    }

}