package org.arielviera.gwt.websockets.server;

//import org.eclipse.jetty.websocket.WebSocket;
//import org.eclipse.jetty.websocket.WebSocketServlet;

/**
 * @author ariel.viera@gmail.com (Ariel Viera)
 */
public class ServerSocket /*extends WebSocketServlet*/ {
//
//    private final Set<PerClientSocket> perClientSockets = new CopyOnWriteArraySet<PerClientSocket>();
//    private ScheduledExecutorService executor = Executors.newSingleThreadScheduledExecutor();
//
//    @Override
//    public void init() throws ServletException {
//        super.init();
////        executor.scheduleAtFixedRate(new Runnable() {
////            @Override
////            public void run() {
////                System.out.println("Running Server Message Sending");
////                for(PerClientSocket member : perClientSockets){
////                    System.out.println("Trying to send to Member!");
////                    if(member.isOpen()){
////                        System.out.println("Sending!");
////                        try {
////                            member.sendMessage("Sending a Message to you client "+new Date()+"\n");
////                        } catch (IOException e) {
////                            e.printStackTrace();
////                        }
////                    }
////                }
////            }
////        }, 2, 2, TimeUnit.SECONDS);
//    }
//
//    protected void doGet(HttpServletRequest request,
//                         HttpServletResponse response) throws ServletException, IOException {
//        getServletContext().getNamedDispatcher("default").forward(request,
//                response);
//    }
//
//    public WebSocket doWebSocketConnect(HttpServletRequest request,
//                                        String protocol) {
//        PerClientSocket clientSocket = new PerClientSocket();
//        perClientSockets.add(clientSocket);
//        return clientSocket;
//    }
//
//    class PerClientSocket implements WebSocket.OnTextMessage {
//        private Connection privateConnection;
//
//        @Override
//        public void onClose(int closeCode, String message) {
//            perClientSockets.remove(this);
//        }
//
//
//        public void sendMessage(String data) throws IOException {
//            privateConnection.sendMessage(data);
//        }
//
//        @Override
//        public void onMessage(String data) {
//            System.out.println("Received: "+data);
//        }
//
//        public boolean isOpen() {
//            return privateConnection.isOpen();
//        }
//
//        @Override
//        public void onOpen(Connection connection) {
//            privateConnection = connection;
//            try {
//                connection.sendMessage("New client has been connected");
//            } catch (IOException e) {
//                e.printStackTrace();
//            }
//        }
//    }
}
