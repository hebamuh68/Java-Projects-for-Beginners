����   7 �  emailApp/email  java/lang/Object 	firstName Ljava/lang/String; lastName password defaultPasswrodLength I 
department Email mail_box_capacity capacity AlternateEmail companysuffix <init> '(Ljava/lang/String;Ljava/lang/String;)V Code
     ()V	   	 
	    
  aeycompany.com	    	     	  "  
  $ % & setDepartment ()Ljava/lang/String;	  (  
  * + , randomPassword (I)Ljava/lang/String;	  .   0 java/lang/StringBuilder
 2 4 3 java/lang/String 5 & toLowerCase
 2 7 8 9 valueOf &(Ljava/lang/Object;)Ljava/lang/String;
 / ;  < (Ljava/lang/String;)V > .
 / @ A B append -(Ljava/lang/String;)Ljava/lang/StringBuilder; D @
 / F G & toString	  I   LineNumberTable LocalVariableTable this LemailApp/email;	 O Q P java/lang/System R S out Ljava/io/PrintStream; U kDEPARTMENT CODES 
1 for Sales 
2 for Development 
3 for Accountant 
0 for none 
Enter the department code: 
 W Y X java/io/PrintStream Z < print \ java/util/Scanner	 O ^ _ ` in Ljava/io/InputStream;
 [ b  c (Ljava/io/InputStream;)V
 [ e f g nextInt ()I i sales k dev m acct o   Ljava/util/Scanner; 	depChoice StackMapTable t ABCDEFGHIJKLMNOPQSTYZ0123456789
 v x w java/lang/Math y z random ()D
 2 | } g length
 2  � � charAt (I)C
 2 �  � ([C)V passowrdSet [C i rand � set_mail_box_capacity (I)V set_Alternate_Email	  �   altEmail changePassword get_mail_box_capacity get_Alternate_Email get_password showInfo � DISPLY NAME:  �   � 
COMPANY EMAIL:  � 
MAILBOX CAPACITY: 
 / � A � (I)Ljava/lang/StringBuilder; � nb 
SourceFile 
email.java !     
                 	 
               
     
             
        �     o*� *
� *@� *� *+� *,� !**� #� '***� � )� -*� /Y+� 1� 6� :=� ?,� 1� ?C� ?*� '� ?=� ?*� � ?� E� H�    J   * 
      
        !  )  5  n  K        o L M     o      o     % &     �     3� NT� V� [Y� ]� aL+� d=� h�� j�� l�n�    J                 ! ( " 0 # K        3 L M      _ p    q 
  r    �   [  + ,     �     5sM�N6� � u,� {�k�6-,� ~U���� 2Y-� ��    J       (  )  +  ,  - # + , / K   >    5 L M     5 } 
   2 �    .  �  
 " � 
   
 � 
  r    �  2 �  � �     >     *� �    J   
    4  5 K        L M       
   � <     >     *+� ��    J   
    9  : K        L M      �    � <     >     *+� -�    J   
    >  ? K        L M          � g     /     *� �    J       B K        L M    � &     /     *� ��    J       E K        L M    � &     /     *� -�    J       H K        L M    � &     s     =� /Y�� :*� � ?�� ?*� !� ?�� ?*� H� ?�� ?*� � ��� ?� E�    J       L  M ( N 9 L K       = L M    �    �