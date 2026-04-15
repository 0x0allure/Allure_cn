<img width="2809" height="779" alt="service architecture" src="https://github.com/user-attachments/assets/57ecc58c-7e3d-4ffb-9f1d-b778b5cd804a" /><br>
# 架构优化后续方案<br>
## 🔴 **P0 危险 **<br>
1.当前架构获取不到真实ip     #后续再frp配置通道来源ip一并转发<br>  （已解决）
2.Kibana配置没有进行登录校验（非常不安全）      #后续联动es进行开启密码登录校验<br>
## 🟠 **P1 重要 **<br>
3.当前单机架构frp没有冗余，一台宕机直接炸     #可以后续加一个frp进行双机热备<br>
4.nginx与上述一样没有冗余                     #增加nginx服务<br>
## 🟡 **P2 一般 **<br>
5.prometheus没有配置告警，只做了监控状态       #增加告警服务<br>
6.kibana和grafana的可视化界面不够完善          #增加多条监控数据以及日志数据

