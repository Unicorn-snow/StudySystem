//一个集合所有窗口的卡片式布局，称为CommFrame
package com.nwnu.pojo;

import javax.swing.*;

import com.nwnu.g.Insert_g;
import com.nwnu.g.Scan_g;
import com.nwnu.g.Search_g;
import com.nwnu.g.Update_g;
import com.nwnu.health.Insert_health;
import com.nwnu.health.Scan_health;
import com.nwnu.health.Search_health;
import com.nwnu.health.Update_health;

import com.nwnu.sign.Insert_sign;
import com.nwnu.sign.Scan_sign;
import com.nwnu.sign.Search_sign;

import com.nwnu.student.Delete_stu;
import com.nwnu.student.Insert_stu;
import com.nwnu.student.Scan_stu;
import com.nwnu.student.Search_stu;
import com.nwnu.student.Update_stu;

import java.awt.*;  
import java.awt.event.*; 

public class CommFrame extends JFrame implements ActionListener {

	    JMenuBar bar; 
	    JMenu menu,menu1,menu2,menu3;  
	    JMenuItem scanItem,deleteItem,updateItem,insertItem,searchItem;
	    JMenuItem scanItem1,deleteItem1,updateItem1,insertItem1,searchItem1; 
	    JMenuItem scanItem2,deleteItem2,updateItem2,insertItem2,searchItem2;
	    JMenuItem scanItem3,deleteItem3,updateItem3,insertItem3,searchItem3;
	    
	    Scan_stu scan;    //查看所有学生信息  
	    Delete_stu delete;//删除学生信息  
	    Update_stu update;//更新学生信息  
	    Insert_stu insert;//插入学生信息  
	    Search_stu search;//查找学生信息  
	    
	    Scan_g scan_g;    //查看个人信息
	    //Delete_g delete_g;//删除个人信息
	    Update_g update_g;//更新个人信息
	    Insert_g insert_g;//插入个人信息
	    Search_g search_g;//查找个人信息
	    
	    Scan_health scan_health;    //查看所有学生健康信息  
	    //Delete_health delete_health;//删除学生健康信息  
	    Update_health update_health;//更新学生健康信息  
	    Insert_health insert_health;//插入学生健康信息  
	    Search_health search_health;//查找学生健康信息  
	    
	    Scan_sign scan_sign;    //查看所有学生签到信息 
	    //Delete_sign delete_sign;//删除学生签到信息 
	    //Update_sign update_sign;//更新学生签到信息 
	    Insert_sign insert_sign;//插入学生签到信息  
	    Search_sign search_sign;//查找学生签到信息 
	    
	    CardLayout card=null;  
	    
	    JPanel pCenter;  
	    CommFrame(){  
	        setLayout(new FlowLayout());  
	        scanItem=new JMenuItem("浏览全部信息");  
	        deleteItem=new JMenuItem("删除信息");  
	        updateItem=new JMenuItem("修改信息");  
	        insertItem=new JMenuItem("添加信息");  
	        searchItem=new JMenuItem("高级查找");  
	        
	        scanItem1=new JMenuItem("浏览");  
	        //deleteItem1=new JMenuItem("删除");  
	        updateItem1=new JMenuItem("修改");  
	        insertItem1=new JMenuItem("添加");  
	        searchItem1=new JMenuItem("查找");  
	        
	        scanItem2=new JMenuItem("查看所有");  
	        //deleteItem2=new JMenuItem("删除");  
	        updateItem2=new JMenuItem("修改");  
	        insertItem2=new JMenuItem("流动信息");  
	        searchItem2=new JMenuItem("查找流动情况"); 
	        
	        scanItem3=new JMenuItem("信息统计");  
	        //deleteItem3=new JMenuItem("删除");  
	        //updateItem3=new JMenuItem("修改");  
	        insertItem3=new JMenuItem("用户打卡");  
	        searchItem3=new JMenuItem("条件查询");  
	        
	        bar=new JMenuBar(); 
	          
	        menu=new JMenu("信息管理");
	        menu1=new JMenu("个人信息");
	        menu2=new JMenu("健康情况及流动情况");
	        menu3=new JMenu("疫情上报");
   
	        menu.add(scanItem);  
	        menu.add(deleteItem);  
	        menu.add(updateItem);  
	        menu.add(insertItem);  
	        menu.add(searchItem);  
	        
	        menu1.add(scanItem1);  
	        //menu1.add(deleteItem1);  
	        menu1.add(updateItem1);  
	        menu1.add(insertItem1);  
	        menu1.add(searchItem1); 
	        
	        menu2.add(scanItem2);  
	        //menu2.add(deleteItem2);  
	        menu2.add(updateItem2);  
	        menu2.add(insertItem2);  
	        menu2.add(searchItem2); 
	        
	        menu3.add(scanItem3);  
	       //menu3.add(deleteItem3);  
	       //menu3.add(updateItem3);  
	        menu3.add(insertItem3);  
	        menu3.add(searchItem3);
	        
	        //添加菜单
	        bar.add(menu);  
	        bar.add(menu1);  
	        bar.add(menu2);
	        bar.add(menu3); 
	        setJMenuBar(bar);  
	        scanItem.addActionListener(this);  
	        deleteItem.addActionListener(this);  
	        updateItem.addActionListener(this);  
	        insertItem.addActionListener(this);  
	        searchItem.addActionListener(this);  
	        
	        scanItem1.addActionListener(this);  
	        //deleteItem1.addActionListener(this);  
	        updateItem1.addActionListener(this);  
	        insertItem1.addActionListener(this);  
	        searchItem1.addActionListener(this);
	        
	        scanItem2.addActionListener(this);  
	        //deleteItem2.addActionListener(this);  
	        updateItem2.addActionListener(this);  
	        insertItem2.addActionListener(this);  
	        searchItem2.addActionListener(this); 
	        
	        scanItem3.addActionListener(this);  
	        //deleteItem3.addActionListener(this);  
	        //updateItem3.addActionListener(this);  
	        insertItem3.addActionListener(this);  
	        searchItem3.addActionListener(this); 
	        
	        scan=new Scan_stu();  
	        update=new Update_stu();  
	        delete=new Delete_stu();  
	        insert=new Insert_stu();  
	        search=new Search_stu();  
	        card=new CardLayout();  
	        
	        scan_g=new Scan_g();  
	        update_g=new Update_g();  
	        //delete_g=new Delete_g();  
	        insert_g=new Insert_g();  
	        search_g=new Search_g();  
	        card=new CardLayout();  
	        
	        scan_health=new Scan_health();  
	        update_health=new Update_health();  
	        //delete_health=new Delete_health();  
	        insert_health=new Insert_health();  
	        search_health=new Search_health();  
	        card=new CardLayout();
	        
	        scan_sign=new Scan_sign();  
	        //update_sign=new Update_sign();  
	        //delete_sign=new Delete_sign();  
	        insert_sign=new Insert_sign();  
	        search_sign=new Search_sign();  
	        card=new CardLayout();
	        
	        pCenter=new JPanel();  
	        pCenter.setLayout(card);  
	        pCenter.add("scanItem", scan);  
	        pCenter.add("deleteItem",delete);  
	        pCenter.add("updateItem",update);  
	        pCenter.add("insertItem",insert);  
	        pCenter.add("searchItem",search);  
	 
	        pCenter.add("scanItem1", scan_g);  
	        //pCenter.add("deleteItem1",delete_g);  
	        pCenter.add("updateItem1",update_g);  
	        pCenter.add("insertItem1",insert_g);  
	        pCenter.add("searchItem1",search_g); 
	        
	        pCenter.add("scanItem2", scan_health);  
	        //pCenter.add("deleteItem2",delete_health);  
	        pCenter.add("updateItem2",update_health);  
	        pCenter.add("insertItem2",insert_health);  
	        pCenter.add("searchItem2",search_health); 
	        
	        pCenter.add("scanItem3", scan_sign);  
	        //pCenter.add("deleteItem3",delete_sign);  
	        //pCenter.add("updateItem3",update_sign);  
	        pCenter.add("insertItem3",insert_sign);  
	        pCenter.add("searchItem3",search_sign); 
	        
	        
	        add(pCenter,BorderLayout.SOUTH);
	        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  
	        setVisible(true);  
	        setBounds(400,150,600,600);  
	        setTitle("西北师范大学疫情上报系统");  
	        validate();  
	    }  
	    

	    
	    public void actionPerformed(ActionEvent e){  
	        if(e.getSource()==scanItem)  
	            card.show(pCenter, "scanItem");  
	        else if(e.getSource()==deleteItem)  
	            card.show(pCenter, "deleteItem");     
	        else if(e.getSource()==updateItem)  
	            card.show(pCenter, "updateItem");  
	        else if(e.getSource()==insertItem)  
	            card.show(pCenter, "insertItem");  
	        else if(e.getSource()==searchItem)  
	            card.show(pCenter, "searchItem");  
	        
	        if(e.getSource()==scanItem1)  
	            card.show(pCenter, "scanItem1");  
	        //else if(e.getSource()==deleteItem1)  
	          //  card.show(pCenter, "deleteItem1");     
	        else if(e.getSource()==updateItem1)  
	            card.show(pCenter, "updateItem1");  
	        else if(e.getSource()==insertItem1)  
	            card.show(pCenter, "insertItem1");  
	        else if(e.getSource()==searchItem1)  
	            card.show(pCenter, "searchItem1"); 
	        
	        if(e.getSource()==scanItem2)  
	            card.show(pCenter, "scanItem2");  
	        //else if(e.getSource()==deleteItem2)  
	            //card.show(pCenter, "deleteItem2");     
	        else if(e.getSource()==updateItem2)  
	            card.show(pCenter, "updateItem2");  
	        else if(e.getSource()==insertItem2)  
	            card.show(pCenter, "insertItem2");  
	        else if(e.getSource()==searchItem2)  
	            card.show(pCenter, "searchItem2");
	        
	        if(e.getSource()==scanItem3)  
	            card.show(pCenter, "scanItem3");  
	        //else if(e.getSource()==deleteItem3)  
	          //  card.show(pCenter, "deleteItem3");     
	        //else if(e.getSource()==updateItem3)  
	          //  card.show(pCenter, "updateItem3");  
	        else if(e.getSource()==insertItem3)  
	            card.show(pCenter, "insertItem3");  
	        else if(e.getSource()==searchItem3)  
	            card.show(pCenter, "searchItem3");
	    }  
	  
}
