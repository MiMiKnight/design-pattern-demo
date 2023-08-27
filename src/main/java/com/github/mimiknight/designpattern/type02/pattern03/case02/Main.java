package com.github.mimiknight.designpattern.type02.pattern03.case02;

/**
 * 透明组合模式
 */
public class Main {
    public static void main(String[] args) {

        // 创建文件夹
        Folder folder1 = new Folder("Java资料");
        Folder folder2 = new Folder("图片资料");
        Folder folder3 = new Folder("文本资料");

        // 创建图像及文本文件
        ImageFile file1 = new ImageFile("思维导图.jpg");
        ImageFile file2 = new ImageFile("类图.png");
        TextFile file3 = new TextFile("Java基础.doc");
        TextFile file4 = new TextFile("Java进阶.txt");

        // 将图像及文本添加进文件夹
        folder2.add(file1);
        folder2.add(file2);
        folder3.add(file3);
        folder3.add(file4);
        //将两个文件夹添加进父文件夹
        folder1.add(folder2);
        folder1.add(folder3);

        // 递归进行查杀
        folder1.killVirus();

    }
}
