// Generated by Dagger (https://dagger.dev).
package com.example.mvvmdagger;

import dagger.internal.Factory;
import javax.inject.Provider;

@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class PlayerViewModel_Factory implements Factory<PlayerViewModel> {
  private final Provider<PlayerRepository> playerRepositoryProvider;

  public PlayerViewModel_Factory(Provider<PlayerRepository> playerRepositoryProvider) {
    this.playerRepositoryProvider = playerRepositoryProvider;
  }

  @Override
  public PlayerViewModel get() {
    return new PlayerViewModel(playerRepositoryProvider.get());
  }

  public static PlayerViewModel_Factory create(
      Provider<PlayerRepository> playerRepositoryProvider) {
    return new PlayerViewModel_Factory(playerRepositoryProvider);
  }

  public static PlayerViewModel newInstance(PlayerRepository playerRepository) {
    return new PlayerViewModel(playerRepository);
  }
}
