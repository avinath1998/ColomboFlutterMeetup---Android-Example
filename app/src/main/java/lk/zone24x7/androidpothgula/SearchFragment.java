package lk.zone24x7.androidpothgula;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

import java.util.ArrayList;
import java.util.List;


public class SearchFragment extends Fragment {

    private RecyclerView mSearchList;
    private ArrayList<Book> books;
    private List<String> categories;
    private Spinner locationSpinner;


    public SearchFragment() {
        // Required empty public constructor
        books = new ArrayList<>();
        books.add(new Book("John Doe", "Nice Two","https://picsum.photos/200/300?image=0"));
        books.add(new Book("Nancy Doe", "Better Two","https://picsum.photos/200/300?image=1"));
        books.add(new Book("Laura Doe", "Nice Two","https://picsum.photos/200/300?image=2"));
        books.add(new Book("John Doe", "Lorem Two","https://picsum.photos/200/300?image=3"));
        books.add(new Book("John Doe", "Nice Two","https://picsum.photos/200/300?image=4"));
        books.add(new Book("John Doe", "Nice Two","https://picsum.photos/200/300?image=5"));
        categories = new ArrayList<>();
        categories.add("Gampaha");
        categories.add("Colombo");
        categories.add("Kottawa");
        categories.add("Jaffna");
    }

    public static SearchFragment newInstance() {
        SearchFragment fragment = new SearchFragment();
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_search, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        mSearchList = view.findViewById(R.id.search_list);
        locationSpinner = view.findViewById(R.id.search_spinner_location);

        locationSpinner.setAdapter(new ArrayAdapter<String>(getContext(), R.layout.registion_spinner_item, categories));
        mSearchList.setLayoutManager(new LinearLayoutManager(getContext(), LinearLayoutManager.HORIZONTAL, false));
        mSearchList.setAdapter(new SearchListAdapter(books));
    }
}
