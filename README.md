# Firebase
Firebase implemetation on android


###Implemeted part of firbase

    com.google.firebase:firebase-auth
    com.google.firebase:firebase-messaging
    com.google.firebase:firebase-database
    com.google.firebase:firebase-config
    com.google.firebase:firebase-analytics
    com.google.firebase:firebase-crash
    
###Send downstream data (custom push notification)

Make rest api post request as follows

API end : https://fcm.googleapis.com/fcm/send

Req. Header : 
    
    Authorization : key=value_of_project_server_key 
    Content-Type  : application/json

 Req. Body   :

    { 
    "data": {
        "title": "5x3",
        "details": "15:10"
      },
      "to":"token_of_user_got_from_firebase"
    }

This data will get delivered to Class extending "FirebaseMessagingService" in onMessageReceived method
and data can be retrived using remoteMessage.getData()


Project server key can be found Firebase console (https://console.firebase.google.com/project/)
Select Project -> Click setting icon -> Project Setting -> Cloud Messaging tab  



              
