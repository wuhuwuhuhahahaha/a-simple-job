# a-simple-job
一个自己写的单体架构，希望熟悉github，并熟悉spring的操作


先把controller，services，dto软件包创建出来，一般来说，这些文件使用小写，而后面的文件如LoginController，会写为驼峰命名
<img width="960" height="540" alt="image" src="https://github.com/user-attachments/assets/1b71db04-40ad-4941-82bd-e35753d6b88a" />

数据库配置如下

<img width="955" height="540" alt="image" src="https://github.com/user-attachments/assets/8a1dfb0c-b386-45df-b37c-046bd1ce3531" />

在生产环境可以这样写
<img width="954" height="540" alt="image" src="https://github.com/user-attachments/assets/b8f93815-efe3-4974-afa3-2de0df381638" />

注册功能
通义灵码偷懒

<img width="278" height="35" alt="image" src="https://github.com/user-attachments/assets/34aa1b78-5c57-4899-a1bf-47ca5b3d8605" />

点复制按钮，直接粘贴到对应的软件包即可

3月12日记
lombok这个插件很头疼，@Data可以写了很多的getter和seter
但是很容易出问题
如果发生了从apifox可以把数据写到mysql上，而项目和apifox报错的很大原因是lombok配置的原因
尝试手写getter和setter，如果项目运行正常，那么大概率就是lombok的原因
在项目的注解处理器上把模块全部移到defalt上是我的解决方式



<img width="463" height="288" alt="image" src="https://github.com/user-attachments/assets/d6cb7598-233d-44ff-a310-20cb5dd0b507" />

3月13日记
完成了一个注册的功能










