package lk.zone24x7.androidpothgula;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.squareup.picasso.Callback;
import com.squareup.picasso.Picasso;

import java.util.List;

/**
 * Created by Avinath on 3/5/2019.
 */
public class SearchListAdapter extends RecyclerView.Adapter<SearchListAdapter.CustomViewHolder> {

    private List<Book> books;


    public SearchListAdapter(List<Book> books){
        this.books = books;
    }

    @NonNull
    @Override
    public CustomViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        return new CustomViewHolder(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item_book, viewGroup, false));
    }

    @Override
    public void onBindViewHolder(@NonNull CustomViewHolder customViewHolder, int i) {
        customViewHolder.bindView(books.get(i));
    }

    @Override
    public int getItemCount() {
        return books.size();
    }

    class CustomViewHolder extends RecyclerView.ViewHolder{

        private ImageView mBookImage;
        private TextView mTextBookName;
        private TextView mTextAuthorName;

        public CustomViewHolder(@NonNull View itemView) {
            super(itemView);
            mBookImage = itemView.findViewById(R.id.item_book_image);
            mTextBookName = itemView.findViewById(R.id.item_book_name);
            mTextAuthorName = itemView.findViewById(R.id.item_author_name);
        }

        public void bindView(Book book){
            Picasso.get().load(book.getPhotoUrl()).into(mBookImage, new Callback() {
                @Override
                public void onSuccess() {
                    Log.d("AdapterList","Success loading image");

                }

                @Override
                public void onError(Exception e) {
                    Log.d("AdapterList","Error loading image"+e.getMessage() );

                }
            });
            mTextBookName.setText(book.getBookname());
            mTextAuthorName.setText(book.getAuthor());

        }
    }
}
