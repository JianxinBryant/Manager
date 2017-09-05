package util;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.util.Random;

import javax.imageio.ImageIO;
import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * ������֤���controller
 */
public class CodeController {
    private int width = 146;//��֤����
    private int height = 65;//��֤��߶�
    private int codeCount = 4;//��֤�����
    private int lineCount = 30;//�����߸���
    private int fontSize = 60; //�����С
    private int codeS = 28; //��֤����
    private int codeTop = 45; //��֤�����ϵױ߾�
    private int codeLeft = 20;//��֤������ױ߾�

    char[] codeSequence = { 'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J',
            'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W',
            'X', 'Y', 'Z', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9' };

    /**
     * �����ȡ��֤��ķ���
     * @param time  timeΪʱ��,�����Ļ����Ա��������������֤��
     * @throws IOException
     */
    public void getCode(HttpServletRequest request,
                        HttpServletResponse response) throws IOException{
        //�����������
        Random r = new Random();
        //����洢��֤�����
        StringBuilder builderCode = new StringBuilder();
        //���廭��
        BufferedImage buffImg = new BufferedImage(width,height,BufferedImage.TYPE_INT_RGB);
        //�õ�����
        Graphics g = buffImg.getGraphics();
        //1.������ɫ,���߿�
        g.setColor(Color.black);
        g.drawRect(0,0,width,height);
        //2.������ɫ,����ڲ�
        g.setColor(Color.white);
        g.fillRect(1,1,width-2,height-2);
        //3.���ø�����
        g.setColor(Color.gray);
        for (int i = 0; i < lineCount; i++) {
            g.drawLine(r.nextInt(width),r.nextInt(width),r.nextInt(width),r.nextInt(width));
        }
        //4.������֤��
        g.setColor(Color.blue);
        //4.1������֤������
        g.setFont(new Font("����",Font.BOLD|Font.ITALIC,30));
        for (int i = 0; i < codeCount; i++) {
            char c = codeSequence[r.nextInt(codeSequence.length)];
            builderCode.append(c);
            g.drawString(c+"",codeLeft+codeS*(i),codeTop);
        }
        //5.�������Ļ
        ServletOutputStream sos = response.getOutputStream();
        ImageIO.write(buffImg,"png",sos);
        //6.���浽session��
        HttpSession session = request.getSession();
        session.setAttribute("codeValidate",builderCode.toString());
        
        //7.��ֹͼ�񻺴档
        response.setHeader("Pragma", "no-cache");
        response.setHeader("Cache-Control", "no-cache");
        response.setDateHeader("Expires", 0);
        
        response.setContentType("image/png");
        //8.�ر�sos
        sos.close();
    }
}