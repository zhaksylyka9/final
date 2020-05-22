import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;
import java.util.ArrayList;

public class Main {
    public static MainFrame frame;
    public static void connect(PackageData pd){
        try{
            Socket socket = new Socket("127.0.0.1", 8808);
            ObjectOutputStream outputStream = new ObjectOutputStream(socket.getOutputStream());
            ObjectInputStream inputStream = new ObjectInputStream(socket.getInputStream());


            if(pd.getOperationType().equals("ADD")){
                outputStream.writeObject(pd);
            }
            else if(pd.getOperationType().equals("LIST")){
                outputStream.writeObject(pd);
                PackageData infoFromServer = (PackageData) inputStream.readObject();
                ArrayList<Student> arrayListFromServer = infoFromServer.getStudents();

                String s = "";
                String a = "";
                for(int i = 0; i<arrayListFromServer.size();i++){
                    s+=arrayListFromServer.get(i) + "\n";
                    a+=arrayListFromServer.get(i) + "\n";
                }
                ListStudent.studentText.append(s);
                ListTeacher.teacherText.append(a);

            }

            inputStream.close();
            outputStream.close();
            socket.close();
        }
        catch (Exception e){
            e.printStackTrace();
        }
    }



    public static OrderMenu[] orders = new OrderMenu[20];
    public static int countOrders = 0;

    public static void addOrder(OrderMenu om){
        orders[countOrders] = om;
        countOrders++;
    }

    public static DancePoolItems[] items = new DancePoolItems[20];
    public static int countItems = 0;

    public static void addItems(DancePoolItems dp){
        items[countItems] = dp;
        countItems++;
    }

    public static void main(String[] args){
        frame = new MainFrame();
        frame.setVisible(true);
    }
}
