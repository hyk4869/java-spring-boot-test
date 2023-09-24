package Exception_handling;

import java.io.IOException;

public class ThrowsMethod {

	public static void main(String[] args) {
		// throwとthrowsの意味と使い分けを初心者向けに解説【Java入門講座】5-3 throwとthrows
		// throw 例外オブジェクト：　例外を強制的に発生させる
		// throws 例外クラス:　メソッドがその例外を発生することを宣言する

		WriteFile wf = new WriteFile();

		try {
			wf.open();
			wf.write();
		} catch (IOException e) {
			System.out.println("IOExceptionが発生しました。");
			e.printStackTrace();
		} catch (Exception e) {
			System.out.println("Exceptionが発生しました。");
			e.printStackTrace();
		} finally {
			wf.close();
		}
	}

}
