/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Praktikum;

/**
 *
 * @author Faris Ikhlasul H
 */
public class Node {

    int data;
    Node left, right;

    Node() {

    }

    Node(int data) {
        this.left = null;
        this.data = data;
        this.right = null;
    }
}
