/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.maze_runner;


import java.awt.Color;
import java.awt.Graphics;
import java.util.ArrayList;
import javax.swing.JFrame;

/**
 *
 * @author Home
 */
public class NewClass extends JFrame{
    
    private final int [][]maze=
    {{1,1,1,1,1,1,1,1,1,1,1,1,1},
     {1,0,1,0,1,0,1,0,0,0,0,0,1},
     {1,0,1,0,1,1,1,0,0,1,0,0,1},
     {1,0,1,1,1,1,1,0,1,0,1,0,1},
     {1,0,0,1,0,0,0,0,1,1,1,0,1},
     {1,0,1,0,1,1,1,0,1,0,0,0,1},       
     {1,0,1,0,1,0,0,0,1,1,1,0,1},
     {1,0,1,0,1,1,1,0,1,0,1,0,1},
     {1,0,0,0,0,0,0,0,0,0,1,9,1},
     {1,1,1,1,1,1,1,1,1,1,1,1,1},
     
     };

  
    public ArrayList<Integer> path= new ArrayList<>();
    
    public NewClass(){
        setTitle("Maze runner");
        setSize(640,720);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        dfs.searchpath(maze, 1, 1, path);
        System.out.println(path);
    }
        
    
    @Override
    public void paint(Graphics g)
    {
        g.translate(50,50);
        for(int i=0;i<maze.length;i++)
        {
            for(int j=0;j<maze[0].length;j++)
            {
                Color color;
                color = switch (maze[i][j]) {
                    case 1 -> Color.BLACK;
                    case 9 -> Color.RED;
                    default -> Color.WHITE;
                };
                g.setColor(color);
                g.fillRect(30*j,30*i,30,30);
                g.setColor(color.RED);
                g.drawRect(30*j, 30*i, 30, 30);
                
            }
        }
        for(int i=0;i<path.size();i+=2)
        {
            int pathx=path.get(i);
            int pathy=path.get(i+1);
            
            System.out.println("x coodinates"+pathx);
             System.out.println("y coodinates"+pathx);
             
             g.setColor(Color.GREEN);
             g.fillRect(30*pathx, 30*pathy, 20, 20);
        }
    }
    public static void main(String[] args){
        NewClass view=new NewClass();
        view.setVisible(true);
        
    }
}   


    

