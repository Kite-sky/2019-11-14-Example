package ex31computer;

import java.util.ArrayList;
import java.util.List;

public interface ComputerParts {
	public float getPrice();
}

class CPU implements ComputerParts {

	@Override
	public float getPrice() {
		// TODO Auto-generated method stub
		System.out.println("返回CPU的价格！");
		return 1200;
	}

}

class HardDisk implements ComputerParts {

	@Override
	public float getPrice() {
		// TODO Auto-generated method stub
		System.out.println("返回HardDisk的价格！");
		return 648;
	}

}

class Memory implements ComputerParts {

	@Override
	public float getPrice() {
		// TODO Auto-generated method stub
		System.out.println("返回Memory的价格！");
		return 300;
	}

}

class DriverController implements ComputerParts {

	@Override
	public float getPrice() {
		// TODO Auto-generated method stub
		System.out.println("返回DriverController的价格！");
		return 20;
	}

}

class CDDriver implements ComputerParts {

	@Override
	public float getPrice() {
		// TODO Auto-generated method stub
		System.out.println("返回CDDriver的价格！");
		return 0;
	}

}

class Keyboard implements ComputerParts {

	@Override
	public float getPrice() {
		// TODO Auto-generated method stub
		System.out.println("返回Keyboard的价格！");
		return 200;
	}

}

class DVDDevice implements ComputerParts {

	@Override
	public float getPrice() {
		// TODO Auto-generated method stub
		System.out.println("返回DVDDevice的价格！");
		return 0;
	}

}

class VideoCard implements ComputerParts {

	@Override
	public float getPrice() {
		// TODO Auto-generated method stub
		System.out.println("返回VideoCard的价格！");
		return 3000;
	}

}

class Monitor implements ComputerParts {

	@Override
	public float getPrice() {
		// TODO Auto-generated method stub
		System.out.println("返回Monitor的价格！");
		return 1200;
	}

}

class FAN implements ComputerParts {

	@Override
	public float getPrice() {
		// TODO Auto-generated method stub
		System.out.println("返回FAN的价格！");
		return 600;
	}

}

class Mouse implements ComputerParts {

	@Override
	public float getPrice() {
		// TODO Auto-generated method stub
		System.out.println("返回Mouse的价格！");
		return 200;
	}

}

class Power implements ComputerParts {

	@Override
	public float getPrice() {
		// TODO Auto-generated method stub
		System.out.println("返回Power的价格！");
		return 600;
	}

}

class Composite implements ComputerParts {
	private List<ComputerParts> a = new ArrayList<ComputerParts>();

	@Override
	public float getPrice() {
		float p = 0;
		// TODO Auto-generated method stub
		System.out.println("返回Composite的价格！");
		for (int i = 0; i < a.size(); i++) {
			p = p + a.get(i).getPrice();
		}
		System.out.println(p);
		return p;
	}

	public void add(ComputerParts c) {
		a.add(c);
	}

	public void remove(ComputerParts c) {
		a.remove(c);
	}

	public void getChild() {
		for (int i = 0; i < a.size(); i++) {
			System.out.println(a.get(i).toString());
		}
	}
}

class MotherBoardPlus extends Composite {

	@Override
	public float getPrice() {
		// TODO Auto-generated method stub
		System.out.println("返回MotherBoardPlus的价格！");
		return super.getPrice()+600;
	}
}

class WholePC extends Composite {
	public void calculateProcess() {
		System.out.println("计算机组装起来后可以完成一定的计算！");
	}
}
