
public class MonitorEx {
	public static void main(String[] args) {
		TV tv = new TV();
		Smart sm = new Smart();
		Navigation nv = new Navigation();

		tv.turnOn(); // TV power On
		sm.turnOn(); // sm power on

		tv.volumeUp(); // tv volume 1 up
		sm.volumeDown(); // sm volume 1 down but can't 
		nv.volumeUp(); // nv volume 1 up but don't operate

		tv.turnOff(); // TV power off
		nv.turnOff(); // NV power off

		nv.runNavi("�λ�"); // Don't operate because NV is not Running
		nv.turnOn(); // NV Power on
		nv.runNavi("�λ걤���� ���� �λ�IT��ī����");
	}
}
