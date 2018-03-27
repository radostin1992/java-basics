import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Iterator;
import java.util.LinkedList;

public class UrlLibrary implements Iterable<String> {
	private LinkedList<String> urls = new LinkedList<String>();

	private class UrlIterator implements Iterator<String> {
		private int index = 0;

		@Override
		public boolean hasNext() {
			return index < urls.size();
		}

		@Override
		public String next() {
			StringBuilder sb = new StringBuilder();

			try {
				URL url1 = new URL(urls.get(index));

				BufferedReader br = new BufferedReader(new InputStreamReader(url1.openStream()));

				String line = null;

				while ((line = br.readLine()) != null) {
					sb.append(line);
					sb.append("\n");
				}
				br.close();
			} catch (MalformedURLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			index++;
			return sb.toString();
		}

		@Override
		public void remove() {
			urls.remove(index);
		}

	}

	public UrlLibrary() {
		urls.add("http://www.caveofprogramming.com");
		urls.add("http://www.abv.bg");
		urls.add("http://www.google.com");
	}

	@Override
	public Iterator<String> iterator() {
		// TODO Auto-generated method stub
		return new UrlIterator();
	}

	// @Override
	// public Iterator<String> iterator() {
	// return urls.iterator();
	// }

}
