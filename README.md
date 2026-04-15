![架构图](https://github.com/user-attachments/assets/69fe07c3-9522-48d5-ba60-f9431d9807a4)
需要优化点：</br>
P0 </br>
1.当前架构获取不到真实ip     #后续再frp配置通道来源ip一并转发</br>
2.Kibana配置没有进行登录校验（非常不安全）      #后续联动es进行开启密码登录校验</br>
p1 </br>
3.当前单机架构frp没有冗余，一台宕机直接炸     #可以后续加一个frp进行双机热备</br>
4.nginx与上述一样没有冗余                     #增加nginx服务</br>
P2</br>
5.prometheus没有配置告警，只做了监控状态       #增加告警服务</br>
6.kibana和grafana的可视化界面不够完善          #增加多条监控数据以及日志数据
