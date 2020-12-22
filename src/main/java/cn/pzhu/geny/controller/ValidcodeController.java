package cn.pzhu.geny.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.imageio.ImageIO;
import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Random;

@Controller
public class ValidcodeController {

    @RequestMapping("validcode")
    protected void Validcode(HttpServletRequest req, HttpServletResponse resp) throws IOException {

        BufferedImage image = new BufferedImage(100, 30, BufferedImage.TYPE_INT_RGB);
        Graphics2D graphics2d = image.createGraphics();
        graphics2d.setColor(Color.WHITE);
        graphics2d.fillRect(0, 0, 100, 30);
        graphics2d.setColor(Color.RED);
        ArrayList<Integer> randomList=new ArrayList<Integer>();
        Random random = new Random();
        for(int i=0;i<4;i++){
            randomList.add(random.nextInt(10));
        }
        graphics2d.setFont(new Font("宋体", Font.BOLD|Font.ITALIC, 16));
        Color[] colors=new Color[]{Color.RED,Color.BLACK,Color.GREEN,Color.BLUE};
        String volidcode="";
        for(int j=0;j<randomList.size();j++){
            graphics2d.setColor(colors[random.nextInt(colors.length)]);
            graphics2d.drawString(randomList.get(j)+"", 20*j+15, 24+(random.nextInt(13)-6));
            volidcode=volidcode+randomList.get(j);
        }
        for (int k = 0; k < 2; k++) {
            graphics2d.setColor(colors[random.nextInt(colors.length)]);
            graphics2d.drawLine(0, random.nextInt(30), 100, random.nextInt(30));
        }
        ServletOutputStream outputStream=resp.getOutputStream();
        ImageIO.write(image, "jpg", outputStream);

        HttpSession hs=req.getSession();
        hs.setAttribute("validcode", volidcode);

    }
}
